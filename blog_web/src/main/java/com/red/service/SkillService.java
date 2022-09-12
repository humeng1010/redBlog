package com.red.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.red.controller.utils.Result;
import com.red.entity.Skill;

public interface SkillService extends IService<Skill> {
    Result getUserSkill(Long userId);
}
