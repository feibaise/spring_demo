package com.feibai.demo3;

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
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);

        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);

        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);

        demoAnnotationService.add();

        demoMethodService.add();

        context.close();
    }
}
