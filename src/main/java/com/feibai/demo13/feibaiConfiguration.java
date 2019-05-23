package com.feibai.demo13;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;

/**
 *@Author: wushi
 *@description: 组合注解
 *@Date: Created in 16:16 2019/5/23
 *@Modify by: wushi
 *@ModifyDate by: 16:16 2019/5/23
 *
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration
@ComponentScan
public @interface feibaiConfiguration {

    String[] value() default {};

}
