package com.red.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.red.entity.UserSkill;
import com.red.mapper.UserSkillMapper;
import com.red.service.UserSkillService;
import org.springframework.stereotype.Service;

@Service
public class UserSkillServiceImpl extends ServiceImpl<UserSkillMapper, UserSkill> implements UserSkillService {
}
