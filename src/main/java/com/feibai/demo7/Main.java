package com.feibai.demo7;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *@Author: wushi
 *@description: 入口
 *@Date: Created in 10:55 2019/5/23
 *@Modify by: wushi
 *@ModifyDate by: 10:55 2019/5/23
 *
 */
public class Main {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

       context.getEnvironment().setActiveProfiles("prod");
       context.register(ProfileConfig.class);
       context.refresh();

       DemoBean demoBean = context.getBean(DemoBean.class);
        System.out.println(demoBean.getContent());

        context.close();

    }



}
