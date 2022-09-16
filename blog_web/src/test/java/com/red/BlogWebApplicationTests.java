package com.red;

import cn.hutool.crypto.digest.MD5;
import com.red.entity.Blog;
import com.red.entity.User;
import com.red.mapper.BlogMapper;
import com.red.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class BlogWebApplicationTests {
    @Value("${user.user-id}")
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

    @Test
    void testMessage() throws NoSuchAlgorithmException {
        MD5 md51 = MD5.create();
        String s = md51.digestHex16("123456");
        byte[] digest1 = md51.digest("123456");
        System.out.println(Arrays.toString(digest1));
//        System.out.println(s);
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        md5.update("123456".getBytes());
        byte[] digest = md5.digest();
        System.out.println(Arrays.toString(digest));
    }

}
