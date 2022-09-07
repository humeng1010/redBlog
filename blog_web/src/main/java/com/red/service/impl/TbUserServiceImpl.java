package com.red.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.red.mapper.TbUserMapper;
import com.red.pojo.TbUser;
import com.red.service.TbUserService;
import org.springframework.stereotype.Service;

/**
 * @author humeng
 * @description 针对表【tb_user】的数据库操作Service实现
 * @createDate 2022-09-07 09:01:45
 */
@Service
public class TbUserServiceImpl extends ServiceImpl<TbUserMapper, TbUser>
        implements TbUserService {

}




