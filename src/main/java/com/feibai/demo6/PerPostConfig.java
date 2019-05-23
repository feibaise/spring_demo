package com.feibai.demo6;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: ${user}
 * @description: 配置类
 * @Date: Created in 11:49 2019/5/23
 * @Modfied by: ${user}
 * @Modfied Date by: 11:49 2019/5/23
 */
@Configuration
@ComponentScan("com.feibai.demo6")
public class PerPostConfig {
    @Bean(initMethod = "init",destroyMethod = "destroy")
    BeanWayService beanWayService(){
        return  new BeanWayService();
    }


    @Bean
    JSR250WayService jsr250WayService(){
        return  new JSR250WayService();
    }
}
