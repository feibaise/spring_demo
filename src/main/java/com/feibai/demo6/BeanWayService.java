package com.feibai.demo6;

/**
 * @Author: ${user}
 * @description:
 * @Date: Created in 11:42 2019/5/23
 * @Modfied by: ${user}
 * @Modfied Date by: 11:42 2019/5/23
 */
public class BeanWayService {

    public void init(){
        System.out.println("@Bean-init-method");
    }

    public  BeanWayService(){
        super();
        System.out.println("初始化构造函数-BeanWayService");
    }

    public void destroy(){
        System.out.println("@Bean-destroy-method");
    }
}
