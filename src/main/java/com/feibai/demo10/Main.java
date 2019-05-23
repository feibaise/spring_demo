package com.feibai.demo10;

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
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);

        AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);

        for (int i = 0; i < 10; i++) {
            asyncTaskService.executeAsyncTask(i);
            asyncTaskService.executeAsyncTaskPlus(i);
        }

        context.close();
    }



}
