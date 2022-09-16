package com.red.controller;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import com.red.controller.utils.Result;
import com.red.entity.Blog;
import com.red.service.BlogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/blogs")
@Slf4j
public class BlogController {

    @Autowired
    private BlogService blogService;

    /**
     * 查询全部
     *
     * @return
     */
    @GetMapping
    public Result getBlogList() {
        return Result.ok(blogService.list());
    }

    /**
     * 根据id查询博客
     *
     * @param blogId
     * @return
     */
    @GetMapping("/{blogId}")
    public Result getBlogById(@PathVariable("blogId") Long blogId) {
        return Result.ok(blogService.getBaseMapper().selectById(blogId));
    }

    /**
     * 博客点击量
     *
     * @param blog
     * @return
     */
    @PutMapping("/addViews")
    public Result updateBlogViews(@RequestBody Blog blog) {
        return blogService.addViews(blog);
    }

}
