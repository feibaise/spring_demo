package com.feibai.demo2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *@Author: wushi
 *@description: 入口
 *@Date: Created in 9:31 2019/5/23
 *@Modify by: wushi
 *@ModifyDate by: 9:31 2019/5/23
 *
 */
public class Main {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        UserFunctionService userFunctionService = context.getBean(UserFunctionService.class);

        System.out.println(userFunctionService.SayHello("java config"));

        context.close();
    }
}
