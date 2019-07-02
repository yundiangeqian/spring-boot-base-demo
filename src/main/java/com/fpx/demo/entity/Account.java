/*
 * Copyright (c) 2016 4PX Information Technology Co.,Ltd. All rights reserved.
 */
package com.fpx.demo.entity;

/**
 * 
 * @author CaoMian
 * @date 2019年7月2日
 */
public class Account {
    /**
     * 账号流水id
     */
    private Integer id;
    /**
     * 账户，唯一的
     */
    private String account;
    /**
     * 密码
     */
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Account [id=" + id + ", account=" + account + ", password=" + password + "]";
    }

}
