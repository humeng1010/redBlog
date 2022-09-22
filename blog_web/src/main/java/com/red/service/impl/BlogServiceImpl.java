package com.red.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.collection.ListUtil;
import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.red.controller.utils.Result;
import com.red.dto.BlogDTO;
import com.red.entity.Blog;
import com.red.mapper.BlogMapper;
import com.red.service.BlogService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    /**
     * 查询部分字段并返回
     *
     * @return
     */
    @Override
    public Result getBlogs() {
        LambdaQueryWrapper<Blog> wrapper = new LambdaQueryWrapper<>();
        wrapper.select(Blog::getBlogId, Blog::getBlogTitle, Blog::getBlogDescription, Blog::getBlogViews, Blog::getBlogLikeCount, Blog::getUpdateTime);
        List<Blog> blogList = this.list(wrapper);
        ArrayList<BlogDTO> blogDTOS = new ArrayList<>();
        for (Blog blog : blogList) {
            BlogDTO blogDTO = BeanUtil.copyProperties(blog, BlogDTO.class);
            blogDTOS.add(blogDTO);
        }
        return Result.ok(blogDTOS);
    }
}
