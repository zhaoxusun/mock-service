package com.personal.mock.exception;

/**
 * author: zhaoxu
 * date: 2019/4/18 下午2:35
 */
public class MockStrategyException extends Exception{
    public MockStrategyException(){
        super();
    }

    public MockStrategyException(String msg) {
        super(msg);
    }

    public MockStrategyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MockStrategyException(Throwable cause) {
        super(cause);
    }

    protected MockStrategyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
