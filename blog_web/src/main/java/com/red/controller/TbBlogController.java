package com.red.controller;

import com.red.controller.utils.Result;
import com.red.service.TbBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/blogs")
public class TbBlogController {
    @Autowired
    private TbBlogService blogService;

    @GetMapping
    public Result getAllBlog() {
        return Result.ok(blogService.list());
    }

}
