package com.red.controller;

import com.red.controller.utils.Result;
import com.red.service.BlogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


@RestController
@RequestMapping("/blogs")
@Slf4j
public class BlogController {

    @Autowired
    private BlogService blogService;

    @GetMapping
    public Result getBlogList(HttpServletRequest request) {
        String authorization = request.getHeader("authorization");
        log.info("token{}", authorization);
//        log.info("查询所有博客{}", blogService.list());
        return Result.ok(blogService.list());
    }

}
