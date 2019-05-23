package com.feibai.demo12;

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
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService listService = context.getBean(ListService.class);
        System.out.println(context.getEnvironment().getProperty("os.name")+"系统下的列表命令为: "+listService.showListCmd());
    }
}
