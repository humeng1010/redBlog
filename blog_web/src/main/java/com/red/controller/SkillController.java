package com.red.controller;

import com.red.controller.utils.Result;
import com.red.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/skills")
public class SkillController {
    @Autowired
    private SkillService skillService;

    @GetMapping("/{userId}")
    public Result getUserSkill(@PathVariable Long userId) {
        return skillService.getUserSkill(userId);
    }

}
