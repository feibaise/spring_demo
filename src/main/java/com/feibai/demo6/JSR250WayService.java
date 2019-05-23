package com.feibai.demo6;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author: ${user}
 * @description:
 * @Date: Created in 11:45 2019/5/23
 * @Modfied by: ${user}
 * @Modfied Date by: 11:45 2019/5/23
 */
public class JSR250WayService {

    @PostConstruct
    public void init(){
        System.out.println("jsr250-init-method");
    }


    public JSR250WayService(){
        super();
        System.out.println("初始化构造函数-JSR250WayService");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("jsr250-destroy-method");
    }
}
