package com.nam89999.springproject01.common;

public enum ResultCode {

    Success(0, "성공"),

    NOT_EXISTS(1000, "존재하지 않는 회원입니다."),
    NOT_CORRECT_MEMBER(1001, "아이디와 비밀번호가 일치하지 않습니다."),

    DBError(9998, "DB 오류입니다."),
    ETCError(9999, "기타 오류입니다.");

    ResultCode(int rtnCd, String rtnMsg) {
        this.rtnCd = rtnCd;
        this.rtnMsg = rtnMsg;
    }

    private int rtnCd;
    private String rtnMsg;

    public int getRtnCd() {
        return rtnCd;
    }

    public String getRtnMsg() {
        return rtnMsg;
    }

    public <T> Result<T> result(T resultObject) {
        return new Result<T>(resultObject, this);
    }


    public <T> Result<T> result() {
        return new Result<>(null, this);
    }

    @Override
    public String toString() {
        return "{" +
                "rtnCd=" + rtnCd +
                ", rtnMsg='" + rtnMsg + '\'' +
                '}';
    }
}
