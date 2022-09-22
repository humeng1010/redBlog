package com.red.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @TableId(value = "user_id", type = IdType.ASSIGN_ID)
    private Long userId;
    private String userName;
    //    不查询用户密码
//    @TableField(select = false)
    private String userPassword;
    private String userEmail;
    private String userAvatar;
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;
    private LocalDate userBirthday;
    private Integer userAge;
    private String userNickname;
    private String userSignature;
}
