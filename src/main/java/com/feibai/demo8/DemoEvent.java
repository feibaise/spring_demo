package com.feibai.demo8;


import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

/**
 *@Author: wushi
 *@description: 自定义事件
 *@Date: Created in 13:46 2019/5/23
 *@Modify by: wushi
 *@ModifyDate by: 13:46 2019/5/23
 *
 */
public class DemoEvent extends ApplicationEvent {

    private static final long serialVersionUID =1L;

    @Getter
    @Setter
    private String msg;

    /**
     * Create a new ApplicationEvent.
     *
     * @param source the component that published the event (never {@code null})
     */
    public DemoEvent(Object source,String msg) {
        super(source);
        this.msg = msg;
    }

}
