/*
 * Copyright (c) 2016 4PX Information Technology Co.,Ltd. All rights reserved.
 */
package com.fpx.demo.exception;

/**
 * 
 * @author CaoMian
 * @date 2019年7月3日
 */
public enum ExceptionEnum {

    EXCEPTION_NULLPOINTE("00001", "空指针异常");
    /**
     * 错误代码
     */
    private String code;

    /**
     * 通用提示
     */
    private String message;

    ExceptionEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
