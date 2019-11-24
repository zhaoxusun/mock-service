package com.personal.mock.exception;

/**
 * author: zhaoxu
 * date: 2019/4/18 下午3:36
 */
public class MockAppStrategyException extends Exception{
    public MockAppStrategyException(){
        super();
    }

    public MockAppStrategyException(String msg) {
        super(msg);
    }

    public MockAppStrategyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MockAppStrategyException(Throwable cause) {
        super(cause);
    }

    protected MockAppStrategyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
