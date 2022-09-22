package com.red.controller;

import cn.hutool.core.lang.UUID;
import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSON;
import cn.hutool.json.JSONUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.red.controller.utils.Result;
import com.red.entity.User;
import com.red.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.*;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/user")
@Slf4j
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


    /**
     * 获取所有用户
     *
     * @return
     */
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
    public Result getUserById(@PathVariable Long userId) {
        return userService.getUserById(userId);
    }


    /**
     * 修改用户信息
     *
     * @param user
     * @return
     */
    @PutMapping("/updateUser")
    public Result updateUser(@RequestBody User user) {
//        log.info("修改用户信息:{}", user);
        return userService.updateUser(user);
    }

}
