package com.red.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Blog {
    @TableId(type = IdType.ASSIGN_ID)
    @TableField(value = "blog_id")
    private Long blogId;
    private Long userId;
    private String blogCover;
    private String blogTitle;
    private String blogDescription;
    private String blogContent;
    private Long blogViews;
    private Long blogLikeCount;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    @Version
    private Integer version;
    @TableLogic(value = "0", delval = "1")
    private Integer deleted;
}
