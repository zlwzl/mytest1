package com.itheima.girl.exception;

import com.itheima.girl.enums.ResultEnums; /**
 * @Author: Mr_Zhao
 * @Description:
 * @Date: Create in 20:16 2017/11/12
 */
public class GirlException extends RuntimeException {

    private Integer code;

    public GirlException(Integer code,String message) {
        super(message);//父类的方法会传递一个message进去
        this.code = code;
    }

    public GirlException(ResultEnums enums) {
        super(enums.getMsg());
        this.code = enums.getCode();

    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
