package com.rum.xianfeng.Core;

import lombok.Data;

@Data
public class Re {
    private String messageCode;
    private Object body;

    public Re(String errorCode, String message) {
        this.messageCode = errorCode;
        this.body = message;
    }
}
