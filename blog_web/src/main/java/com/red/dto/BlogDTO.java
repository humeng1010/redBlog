package com.red.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BlogDTO {
    private Long blogId;
    private String blogTitle;
    private String blogDescription;
    private Long blogViews;
    private Long blogLikeCount;
    private LocalDateTime updateTime;
}
