/*
 * Copyright (c) 2016 4PX Information Technology Co.,Ltd. All rights reserved.
 */
package com.fpx.demo.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.fpx.demo.core.ResponseResult;

/**
 * 
 * @author CaoMian
 * @date 2019年7月2日
 */
@ControllerAdvice
public class ExceptionHandle {
    @ExceptionHandler(ArithmeticException.class)
    public String arithmeticExceptionHandle() {
        return "error/arithmeticException";
    }

    @SuppressWarnings("static-access")
    @ExceptionHandler(NullPointerException.class)
    public String nullPointerExceptionHandle(Model model) {
        ResponseResult<Object> result = new ResponseResult<Object>();
        model.addAttribute("result", result.error(ExceptionEnum.EXCEPTION_NULLPOINTE.getCode(),
                ExceptionEnum.EXCEPTION_NULLPOINTE.getMessage()));
        return "error/nullPointerException";
    }
}
