/*
 * Copyright (c) 2016 4PX Information Technology Co.,Ltd. All rights reserved.
 */
package com.fpx.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fpx.demo.entity.Account;

/**
 * 
 * @author CaoMian
 * @date 2019年7月2日
 */
@Mapper
public interface IAccountDAO {

    /**
     * 查询所有账户
     * 
     * @return
     */
    List<Account> listAllAccount();

}
