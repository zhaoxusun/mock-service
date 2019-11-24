package com.personal.mock.exception;

/**
 * author: zhaoxu
 * date: 2019/4/2 下午8:17
 */
public class RequestParamException extends Exception{
    public RequestParamException(){
        super();
    }

    public RequestParamException(String msg) {
        super(msg);
    }

    public RequestParamException(String message, Throwable cause) {
        super(message, cause);
    }

    public RequestParamException(Throwable cause) {
        super(cause);
    }

    protected RequestParamException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
