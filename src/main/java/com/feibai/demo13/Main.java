package com.feibai.demo13;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: ${user}
 * @description:
 * @Date: Created in 16:08 2019/5/23
 * @Modfied by: ${user}
 * @Modfied Date by: 16:08 2019/5/23
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        DemoService demoService = context.getBean(DemoService.class);
        demoService.outputResult();
        context.close();
    }
}
