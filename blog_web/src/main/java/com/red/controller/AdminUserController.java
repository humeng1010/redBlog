package com.red.controller;

import com.red.controller.utils.Result;
import com.red.entity.User;
import com.red.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/adminUser")
public class AdminUserController {
    @Resource
    private UserService userService;

    @GetMapping("/{userId}")
    public Result getUserById(@PathVariable("userId") Long userId) {
        return userService.getUserSomeInfoById(userId);
    }

    @PutMapping("/update")
    public Result updateUserById(@RequestBody User user) {
        return Result.ok(userService.updateById(user));
    }

    @PutMapping("/updatePassword")
    public Result updatePassword(@RequestBody User user) {
        return userService.updatePassword(user);
    }

}
