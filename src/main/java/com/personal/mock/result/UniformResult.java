package com.personal.mock.result;

import java.io.Serializable;


/**
 * author: zhaoxu
 * date: 2019/3/27 上午10:42
 */
public class UniformResult<T> implements Serializable {
    private Integer code;
    private String reason;
    private T result;
    private UniformResult<T> state(Integer code, String reason, T result){
        this.code = code;
        this.reason = reason;
        this.result = result;
        return this;
    }

    public UniformResult success() {
        return state(0,"success",null);
    }

    public UniformResult<T> success(T result) {
        return state(0,"success",result);
    }


    public UniformResult failed(Integer failCode) {
        return state(failCode,"failed",null);
    }

    public UniformResult failed(Integer failCode,String reason) {
        return state(failCode,reason,null);
    }

    public UniformResult<T> failed(Integer failCode,String reason,T result) {
        return state(failCode,reason,result);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

}
