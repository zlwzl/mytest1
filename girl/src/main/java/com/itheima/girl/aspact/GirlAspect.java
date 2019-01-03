package com.itheima.girl.aspact;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Author: Mr_Zhao
 * @Description:
 * @Date: Create in 19:59 2017/11/12
 */
@Component
@Aspect
public class GirlAspect {


    @Pointcut("execution(* com.itheima.girl.controller.GirlController.*(..))")
    public void log() {

    }


    @Before("log()")
    public void before() {
        System.out.println("AOP之前执行...........");
    }

    @After("log()")
    public void after() {
        System.out.println("AOP之后执行...........");
    }



}
