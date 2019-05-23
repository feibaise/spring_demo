package com.feibai.demo8;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Author: ${user}
 * @description:  事件监听器
 * @Date: Created in 13:51 2019/5/23
 * @Modfied by: ${user}
 * @Modfied Date by: 13:51 2019/5/23
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {


    @Override
    public void onApplicationEvent(DemoEvent event) {
        String msg = event.getMsg();
        System.out.println("我(bean-demoListener)接收到了 bean-demoPublisher发布的消息:"+msg);
    }

}
