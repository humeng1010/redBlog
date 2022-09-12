package com.red.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.red.entity.UserSkill;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserSkillMapper extends BaseMapper<UserSkill> {
    /**
     * 通过userId查询skillId
     *
     * @param userId 用户id
     * @return 技能Id
     */
    List<Long> selectSkillIdByUserId(@Param("userId") Long userId);
}
