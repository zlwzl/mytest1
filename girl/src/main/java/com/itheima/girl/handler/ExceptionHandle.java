package com.itheima.girl.handler;

import com.itheima.girl.ResultUtils.ResultUtils;
import com.itheima.girl.domain.Result;
import com.itheima.girl.exception.GirlException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: Mr_Zhao
 * @Description:
 * @Date: Create in 20:13 2017/11/12
 */
@ControllerAdvice
public class ExceptionHandle {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e) {

        if(e instanceof GirlException) {
            GirlException ee = (GirlException)e;
            return ResultUtils.failure(ee.getCode(),ee.getMessage());
        }
        return ResultUtils.failure(100,e.getMessage());
    }
}
