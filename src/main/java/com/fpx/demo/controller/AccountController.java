/*
 * Copyright (c) 2016 4PX Information Technology Co.,Ltd. All rights reserved.
 */
package com.fpx.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fpx.demo.entity.Account;
import com.fpx.demo.service.IAccountService;

/**
 * 
 * @author CaoMian
 * @date 2019年7月2日
 */
@RestController
public class AccountController {

    @Autowired
    private IAccountService accountService;

    /**
     * 查询所有账户
     * @return
     */
    @GetMapping("/account")
    public List<Account> listAllAccount() {
     return accountService.listAllAccount();
    }
}
