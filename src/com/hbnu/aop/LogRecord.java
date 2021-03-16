package com.hbnu.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author 陈迪凯
 * @date 2021-03-16 16:34
 */
@Aspect
public class LogRecord {

    @Before("execution(* com.hbnu.aop.UserService.*(..))")
    public void before1() {
        System.out.println("在被增强方法之前执行>>>>>:...");
    }

    @Around("execution(* com.hbnu.aop.UserService.*(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("被增强方法之前执行==>:.........");

        // 执行被增强方法
        proceedingJoinPoint.proceed();

        System.out.println("被增强方法之后执行==>:.........");
    }
}
