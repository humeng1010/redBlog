package com.red.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.red.common.PasswordEncoder;
import com.red.controller.utils.Result;
import com.red.dto.AdminUserDTO;
import com.red.entity.User;
import com.red.mapper.UserMapper;
import com.red.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    /**
     * 根据id获取用户 并把用户信息存放到redis中
     *
     * @param userId
     * @return
     */
    @Override
    public Result getUserById(Long userId) {
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
        String cacheUser = ops.get("user:" + userId);
        log.info("从redis中获取的用户信息为:{}", cacheUser);
        if (StrUtil.isNotBlank(cacheUser)) {
            User user = JSONUtil.toBean(cacheUser, User.class);
            return Result.ok(user);
        }
        User user = this.getById(userId);
        if (user == null) {
            return Result.fail("用户不存在");
        }
        String toJsonStr = JSONUtil.toJsonStr(user);
        ops.set("user:" + userId, toJsonStr);//注意这里没有设置过期时间,所以在修改用户和删除用户的时候需要手动删除redis缓存
        return Result.ok(user);
    }

    /**
     * 修改用户信息
     *
     * @param user
     * @return
     */
    @Override
    public Result updateUser(User user) {
        if (user == null) {
            return Result.fail("用户信息不能为空");
        }
        if (user.getUserId() == null) {
            return Result.fail("用户id不能为空");
        }
        boolean update = this.updateById(user);
        if (update) {
            //修改成功后删除redis缓存
            stringRedisTemplate.delete("user:" + user.getUserId());
            return Result.ok("修改成功");
        }
        return Result.fail("修改失败");
    }

    @Override
    public Result getUserSomeInfoById(Long userId) {
        User user = this.getById(userId);
        if (user == null) {
            return Result.fail("用户不存在");
        }

        AdminUserDTO adminUserDTO = BeanUtil.copyProperties(user, AdminUserDTO.class, "password", "createTime", "updateTime");
        log.info("adminUserDTO:{}", adminUserDTO);
        return Result.ok(adminUserDTO);

    }

    /**
     * 修改密码
     *
     * @param user
     * @return
     */
    @Override
    public Result updatePassword(User user) {
        if (user == null) {
            return Result.fail("用户信息不能为空");
        }
        if (user.getUserId() == null) {
            return Result.fail("用户id不能为空");
        }
        if (StrUtil.isBlank(user.getUserPassword())) {
            return Result.fail("密码不能为空");
        }
        //加密密码
        String encodePassword = PasswordEncoder.encode(user.getUserPassword());
        user.setUserPassword(encodePassword);
        log.info("加密后的密码为:{}", encodePassword);
        //修改密码
        boolean update = this.updateById(user);
        if (update) {
            //修改成功后删除redis缓存
            stringRedisTemplate.delete("user:" + user.getUserId());
            return Result.ok("修改成功");
        }
        return Result.fail("修改失败");
    }

}
