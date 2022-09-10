package com.red.handler;

import com.red.controller.utils.Result;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandler {
    /**
     * 拦截所有异常,之后进行业务异常的细粒度控制
     *
     * @param exception
     * @return
     */
    @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
    public Result doException(Exception exception) {
        exception.printStackTrace();
        return Result.fail("出现异常,请稍后再试");
    }
}
