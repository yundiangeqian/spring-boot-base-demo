/*
 * Copyright (c) 2016 4PX Information Technology Co.,Ltd. All rights reserved.
 */
package com.fpx.demo.service.impl;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fpx.demo.entity.Account;
import com.fpx.demo.service.IAccountService;

/**
 * 
 * @author CaoMian
 * @date 2019年7月2日
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountServiceTest {
    @Autowired
    private IAccountService accountService;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("beforeClass");
    }

    @Before
    public void Before() {
        System.out.println("before");
    }

    @Test
    public void testGetAccount() {
        List<Account> accounts = accountService.listAllAccount();
        Assert.assertNotNull("不能为null", accounts);
        System.out.println(accounts);
    }


    @After
    public void after() {
        System.out.println("after");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("afterClass");
    }

}
