package com.red.dto;

import lombok.Data;

@Data
public class AdminUserDTO {
    private Long userId;
    private String userName;
    private String userEmail;
    private String userAvatar;
    private String userBirthday;
    private String userAge;
    private String userNickname;
    private String userSignature;

}
