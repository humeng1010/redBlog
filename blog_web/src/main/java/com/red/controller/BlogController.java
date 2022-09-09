package com.red.controller;

import com.red.controller.utils.Result;
import com.red.service.BlogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
        return Result.ok(blogService.list());
    }

    @GetMapping("/{blogId}")
    public Result getBlogById(@PathVariable("blogId") Long blogId) {
        return Result.ok(blogService.getById(blogId));
    }

}
