package com.red.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.red.entity.User;
import com.red.mapper.UserMapper;
import com.red.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
