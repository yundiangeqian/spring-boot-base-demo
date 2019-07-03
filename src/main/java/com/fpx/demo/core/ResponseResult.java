/*
 * Copyright (c) 2016 4PX Information Technology Co.,Ltd. All rights reserved.
 */
package com.fpx.demo.core;

/**
 * 
 * @author CaoMian
 * @date 2019年7月3日
 */
public class ResponseResult<T> {
    /**
     * 响应码
     */
    private String code;

    /**
     * 响应消息
     */
    private String message;

    /**
     * 业务数据
     */
    private T data;

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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    /**
     * 成功，并且封装数据
     * 
     * @param object
     * @return
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static ResponseResult success(Object object) {
        ResponseResult result = new ResponseResult();
        result.setCode("100");
        result.setMessage("SUCCESS");
        if (object != null) {
            result.setData(object);
        }
        return result;
    }

    /**
     * 成功，并且封装数据
     * 
     * @param code
     * @param message
     * @param object
     * @return
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static ResponseResult success(String code, String message, Object object) {
        ResponseResult result = new ResponseResult();
        result.setCode(code);
        result.setMessage(message);
        if (object != null) {
            result.setData(object);
        }
        return result;
    }

    /**
     * 失败
     * 
     * @param code
     * @param message
     * @return
     */
    @SuppressWarnings("rawtypes")
    public static ResponseResult error(String code, String message) {
        ResponseResult result = new ResponseResult();
        result.setCode(code);
        result.setMessage(message);
        return result;
    }

}
