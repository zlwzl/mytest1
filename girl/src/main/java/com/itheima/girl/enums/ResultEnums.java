package com.itheima.girl.enums;

/**
 * @Author: Mr_Zhao
 * @Description:
 * @Date: Create in 20:21 2017/11/12
 */
@SuppressWarnings("all")
public enum  ResultEnums {
    UNKONW_ERROP(-1,"未知错误"),
    SUCCESS(0,"成功"),
    PRIMARY_SCHOOL(100,"还在上小学"),
    MIDDLE_SCHOOL(101,"还在上初中"),
    ADD_MONEY(102,"加钱")
    ;


    private Integer code;

    private String msg;

    ResultEnums(Integer code,String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
