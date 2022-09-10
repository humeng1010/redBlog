package com.red;

import cn.hutool.crypto.digest.MD5;
import com.red.entity.Blog;
import com.red.entity.User;
import com.red.mapper.BlogMapper;
import com.red.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;

import java.nio.charset.StandardCharsets;
import java.util.List;

@SpringBootTest
class BlogWebApplicationTests {
    @Value("${user.id}")
    private Long userId;
    @Autowired
    private BlogMapper blogMapper;

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        List<Blog> blogs = blogMapper.selectList(null);
        System.out.println("blogs = " + blogs);
    }

    @Test
    void testGetUserById() {
//        List<User> users = userMapper.selectList(null);
        User user = userMapper.selectById(userId);
        System.out.println(user);
    }

}
