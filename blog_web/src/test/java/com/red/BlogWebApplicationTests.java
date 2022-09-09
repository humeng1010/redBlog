package com.red;

import cn.hutool.crypto.digest.MD5;
import com.red.entity.Blog;
import com.red.mapper.BlogMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.nio.charset.StandardCharsets;
import java.util.List;

@SpringBootTest
class BlogWebApplicationTests {
    @Autowired
    private BlogMapper blogMapper;

    @Test
    void contextLoads() {
        List<Blog> blogs = blogMapper.selectList(null);
        System.out.println("blogs = " + blogs);
    }

}
