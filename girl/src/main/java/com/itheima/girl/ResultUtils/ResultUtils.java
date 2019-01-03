package com.itheima.girl.ResultUtils;

import com.itheima.girl.domain.Result;

/**
 * @Author: Mr_Zhao
 * @Description:
 * @Date: Create in 20:12 2017/11/12
 */
public class ResultUtils {

    public static Result success() {
        return ResultUtils.success(null);
    }
    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(0);
        result.setMsg("成功");
        result.setData(object);
        return result;
}
    public static Result failure(Integer code,String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

}
