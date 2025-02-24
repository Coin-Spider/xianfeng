package com.rum.xianfeng.Core.Exception;

import lombok.Data;

public enum ApiExcept {
    RegisterFile("0001","注册失败"),
    PhoneWrong("0002","电话号码错误"),
    UserExist("0003","用户已存在");
    private String code;
    private String msg;
    ApiExcept(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }

}
