package com.red.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.red.controller.utils.Result;
import com.red.entity.Blog;
import com.red.mapper.BlogMapper;
import com.red.service.BlogService;
import org.springframework.stereotype.Service;

@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {
    @Override
    public Result addViews(Blog blog) {
        //        log.info("传递的参数{}", blog);
        if (blog == null) {
            return Result.fail("blog不能为空");
        }
        Long blogViews = blog.getBlogViews();
        blog.setBlogViews(blogViews + 1);

        Blog blog1 = BeanUtil.copyProperties(blog, Blog.class);
        this.updateById(blog1);
        return Result.ok(blog1);
    }
}
