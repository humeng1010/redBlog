package com.red.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.red.controller.utils.Result;
import com.red.entity.User;

public interface UserService extends IService<User> {
    Result getUserById(Long userId);

    Result updateUser(User user);

    Result getUserSomeInfoById(Long userId);

    Result updatePassword(User user);
}
