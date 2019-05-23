package com.feibai.demo11;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: ${user}
 * @description:
 * @Date: Created in 15:53 2019/5/23
 * @Modfied by: ${user}
 * @Modfied Date by: 15:53 2019/5/23
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);
    }
}
