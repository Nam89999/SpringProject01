package com.nam89999.springproject01.common;

public class Result<T> {

    private final T resultObject;
    private final ResultCode resultCode;

    public Result(T resultObject, ResultCode resultCode) {
        this.resultObject = resultObject;
        this.resultCode = resultCode;
    }

    public T getResultObject() {
        return resultObject;
    }

    public ResultCode getResultCode() {
        return resultCode;
    }

    public boolean isSuccess() {
        return ResultCode.Success.equals(resultCode);
    }

    public boolean isNotSuccess() {
        return !isSuccess();
    }

    @Override
    public String toString() {
        return "{" +
                "resultObject=" + resultObject +
                ", resultCode=" + resultCode +
                '}';
    }
}
