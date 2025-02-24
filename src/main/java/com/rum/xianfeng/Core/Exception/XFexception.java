package com.rum.xianfeng.Core.Exception;

public class XFexception extends RuntimeException {
    private String errorCode;
    public XFexception(String errorCode,String message) {
        super(message);
        this.errorCode = errorCode;
    }
    public XFexception(ApiExcept except) {
        super(except.getMsg());
        this.errorCode = except.getCode();
    }
    public String getErrorCode() {
      return errorCode;
    }
    public void setErrorCode(String errorCode) {
      this.errorCode = errorCode;
    }
}
