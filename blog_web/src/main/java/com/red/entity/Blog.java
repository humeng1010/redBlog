package com.red.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@TableName("tb_blog")
public class Blog {
    @TableId(type = IdType.ASSIGN_ID)
    private Long blogId;
    private Long userId;
    private String blogCover;
    private String blogTitle;
    private String blogContent;
    private Long blogViews;
    private Long blogLikeCount;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
