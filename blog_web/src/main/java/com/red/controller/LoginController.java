package com.red.controller;

import cn.hutool.core.lang.UUID;
import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.red.common.RedisConstant;
import com.red.controller.utils.Result;
import com.red.dto.UserDTO;
import com.red.entity.User;
import com.red.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class LoginController {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Result login(@RequestBody UserDTO userDTO) {
        String username = userDTO.getUsername();
        String password = userDTO.getPassword();
        if (StrUtil.isBlank(username) || StrUtil.isBlank(password)) {
            return Result.fail("用户名或密码不能为空");
        }

        //查询用户是否存在(用户名唯一)
        User user = userService.getBaseMapper().selectOne(new QueryWrapper<User>().eq("user_name", username));
        if (ObjectUtil.isEmpty(user)) {
            return Result.fail("用户不存在");
        }
        if (!user.getUserPassword().equals(password)) {
            return Result.fail("密码错误");
        }
        String token = UUID.randomUUID().toString();
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
        //保存token到redis 七天过期
        ops.set(RedisConstant.BLOG_USER_TOKEN + token, JSONUtil.toJsonStr(user), 7, TimeUnit.DAYS);
        return Result.ok(token);
    }

}
