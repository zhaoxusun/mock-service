package com.personal.mock.exception;

/**
 * author: zhaoxu
 * date: 2019/4/18 下午2:30
 */
public class MockAppException extends Exception{

    public MockAppException(){
        super();
    }

    public MockAppException(String msg) {
        super(msg);
    }

    public MockAppException(String message, Throwable cause) {
        super(message, cause);
    }

    public MockAppException(Throwable cause) {
        super(cause);
    }

    protected MockAppException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
