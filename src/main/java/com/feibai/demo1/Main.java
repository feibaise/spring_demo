package com.feibai.demo1;

import com.feibai.demo2.UserFunctionService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *@Author: wushi
 *@description: 入口
 *@Date: Created in 9:18 2019/5/23
 *@Modify by: wushi
 *@ModifyDate by: 9:18 2019/5/23
 *
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);

        UserFunctionService userFunctionService = context.getBean(UserFunctionService.class);

        System.out.println(userFunctionService.SayHello("di"));

        context.close();

    }
}
