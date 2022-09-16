package com.red.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.red.controller.utils.Result;
import com.red.entity.Blog;

public interface BlogService extends IService<Blog> {
    Result addViews(Blog blog);

}
