package com.red.controller;

import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSON;
import cn.hutool.json.JSONUtil;
import com.red.controller.utils.Result;
import com.red.entity.User;
import com.red.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
//@ConfigurationProperties(prefix = "user")//这个是通过set属性进行赋值的 注意要么这个类声明成bean并且得被扫描到,或者在配置类上使用@EnableConfigurationProperties注解
public class UserController {
//    @Value("${user.user-id}")//通过简单类型注入 或者上面的@ConfigurationProperties形式注入
//    private Long userId;

    /*public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }*/

    @Autowired
    private UserService userService;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @GetMapping
    public Result getAllUser() {
        return Result.ok(userService.list());
    }

    /**
     * 获取默认用户 因为目前是个人博客 只有一个用户 也不需要登陆业务 所以用户id前端不传递默认是默认用户的id 传递则使用传递的id
     *
     * @return
     */
    @GetMapping("/{userId}")
    public Result getDefaultUser(@PathVariable Long userId) {
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
        String cacheUser = ops.get("user:" + userId);
        if (StrUtil.isNotBlank(cacheUser)) {
            User user = JSONUtil.toBean(cacheUser, User.class);
            return Result.ok(user);
        }
        User user = userService.getById(userId);
        if (user == null) {
            return Result.fail("用户不存在");
        }
        String toJsonStr = JSONUtil.toJsonStr(user);
        ops.set("user:" + userId, toJsonStr);//注意这里没有设置过期时间,所以在修改用户和删除用户的时候需要手动删除redis缓存
        return Result.ok(user);
    }
}
