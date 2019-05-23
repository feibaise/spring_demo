package com.feibai.demo6;

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
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PerPostConfig.class);

       BeanWayService beanWayService = context.getBean(BeanWayService.class);
       JSR250WayService jsr250WayService = context.getBean(JSR250WayService.class);

        context.close();
    }



}
