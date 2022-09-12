package com.red.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.red.controller.utils.Result;
import com.red.entity.Skill;
import com.red.mapper.SkillMapper;
import com.red.mapper.UserSkillMapper;
import com.red.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillServiceImpl extends ServiceImpl<SkillMapper, Skill> implements SkillService {

    @Autowired
    private UserSkillMapper userSkillMapper;

    @Override
//    @Transactional 这里只是多表查询 不涉及修改操作 所以不需要开启事务
    public Result getUserSkill(Long userId) {
        List<Long> skillIds = userSkillMapper.selectSkillIdByUserId(userId);

        List<Skill> skills = this.listByIds(skillIds);

        return Result.ok(skills);
    }
}
