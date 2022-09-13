package com.red.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.red.controller.utils.Result;
import com.red.dto.UserSkillDTO;
import com.red.entity.Skill;
import com.red.entity.UserSkill;
import com.red.mapper.SkillMapper;
import com.red.mapper.UserSkillMapper;
import com.red.service.SkillService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
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

    @Override
    @Transactional
    public Result addUserSkill(UserSkillDTO userSkillDto) {
        Long user_id = userSkillDto.getUserId();
        //1.获取技术
        String skill = userSkillDto.getSkill();
        //2.判断skill表中是否有该技术
        LambdaQueryWrapper<Skill> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Skill::getSkill, skill);
        Skill skill1 = this.getOne(queryWrapper);

        Long skill_id = null;
        if (skill1 != null) {
            //3.存在该技术则获取技术的id
            skill_id = skill1.getId();
            log.info("存在该技术,技术id{},技术名称{}", skill_id, skill);
        } else {
            //4.不存在则新增
            Skill skill2 = new Skill();
            skill2.setSkill(skill);
            this.save(skill2);
            skill_id = skill2.getId();
            log.info("不存在该技术,新增成功,技术id{},技术名称{}", skill_id, skill);
        }
        
        UserSkill userSkill = new UserSkill(user_id, skill_id);
        //5.保存到user_skill表中
        userSkillMapper.insert(userSkill);
        return Result.ok();
    }
}
