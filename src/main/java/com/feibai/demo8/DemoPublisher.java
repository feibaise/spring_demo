package com.feibai.demo8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @Author: ${user}
 * @description: 事件发布
 * @Date: Created in 13:55 2019/5/23
 * @Modfied by: ${user}
 * @Modfied Date by: 13:55 2019/5/23
 */
@Component
public class DemoPublisher {

    @Autowired
    ApplicationContext applicationContext;

    public void  publisher(String msg){
        applicationContext.publishEvent(new DemoEvent(this,msg));
    }

}