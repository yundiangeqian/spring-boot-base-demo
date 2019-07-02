/*
 * Copyright (c) 2016 4PX Information Technology Co.,Ltd. All rights reserved.
 */
package com.fpx.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fpx.demo.dao.IAccountDAO;
import com.fpx.demo.entity.Account;
import com.fpx.demo.service.IAccountService;

/**
 * 
 * @author CaoMian
 * @date 2019年7月2日
 */
@Service
public class AccountService implements IAccountService {

    @Autowired
    private IAccountDAO accountDAO;

    @Override
    public List<Account> listAllAccount() {
        return accountDAO.listAllAccount();
    }

}
