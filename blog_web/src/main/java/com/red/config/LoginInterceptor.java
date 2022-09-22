package com.red.config;

import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONUtil;
import com.red.common.RedisConstant;
import com.red.common.ThreadLocals;
import com.red.controller.utils.Result;
import com.red.dto.UserDTO;
import com.red.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 登陆拦截器
 */
@Component
@Slf4j
public class LoginInterceptor implements HandlerInterceptor {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("进入拦截器");
        //如果请求头中携带了token，放行
        String token = request.getHeader("Authorization");
        //判断token是否和redis中的token一致
        String user = stringRedisTemplate.opsForValue().get(RedisConstant.BLOG_USER_TOKEN + token);
        if (StrUtil.isNotBlank(user)) {
            User user1 = JSONUtil.toBean(user, User.class);
            UserDTO userDTO = new UserDTO();
            userDTO.setUsername(user1.getUserName());
            userDTO.setPassword(user1.getUserPassword());
//            BeanUtil.copyProperties(user1, userDTO);
//            log.info("用户已登录{}", user);
            ThreadLocals.setUser(userDTO);

            log.info("用户已登录{}", ThreadLocals.getUser());
            return true;
        }
        //如果不一致，返回错误信息
        response.setContentType("application/json;charset=utf-8");
        response.setStatus(502);
        Result fail = Result.fail("用户未登录");
        String jsonStr = JSONUtil.toJsonStr(fail);
        response.getWriter().write(jsonStr);
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
