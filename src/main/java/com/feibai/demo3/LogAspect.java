package com.feibai.demo3;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 *@Author: wushi
 *@description: 编写切面
 *@Date: Created in 9:49 2019/5/23
 *@Modify by: wushi
 *@ModifyDate by: 9:49 2019/5/23
 *
 */
@Aspect
@Component
public class LogAspect {

    /**
     * 注解声明切点
     */
    @Pointcut("@annotation(com.feibai.demo3.Action)")
    public void annotationPointCut(){};

    /**
     * 声明一个建言,使用@pointcut定义的切点
     * @param joinPoint
     */
    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("注解式拦截 " +action.name());

    };

    @Before("execution(* com.feibai.demo3.DemoMethodService.*(..))")
    public void  before(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法式拦截 " +method.getName());

    }
}
