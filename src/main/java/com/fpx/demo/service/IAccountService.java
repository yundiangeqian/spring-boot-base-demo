/*
 * Copyright (c) 2016 4PX Information Technology Co.,Ltd. All rights reserved.
 */
package com.fpx.demo.service;

import java.util.List;

import com.fpx.demo.entity.Account;

/**
 * 
 * @author CaoMian
 * @date 2019年7月2日
 */
public interface IAccountService {

    /**
     * 查询所有账户
     * 
     * @return
     */
    List<Account> listAllAccount();

}
