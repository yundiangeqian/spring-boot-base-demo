/*
 * Copyright (c) 2016 4PX Information Technology Co.,Ltd. All rights reserved.
 */
package com.fpx.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fpx.demo.core.ResponseResult;
import com.fpx.demo.entity.Account;
import com.fpx.demo.exception.ExceptionEnum;
import com.fpx.demo.exception.NullPointerException;

/**
 * 
 * @author CaoMian
 * @date 2019年7月2日
 */
@Controller
public class ExceptionController {

    @GetMapping("/exception")
    public void test() {
        try {
            int result = 5 / 0;
            System.out.println(result);
        } catch (Exception e) {
            throw new ArithmeticException();
        }
    }

    @SuppressWarnings({ "unchecked", "static-access" })
    @GetMapping("/null")
    @ResponseBody
    public ResponseResult<Object> testNull(Boolean flag) {
        if (flag) {
            throw new NullPointerException(ExceptionEnum.EXCEPTION_NULLPOINTE);
        }
        ResponseResult<Object> responseResult = new ResponseResult<Object>();
        Account account = new Account();
        account.setAccount("admin");
        account.setPassword("123456");
        return responseResult.success("100", "非空", account);
    }
}
