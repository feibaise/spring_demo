package com.feibai.demo3;

import java.lang.annotation.*;

/**
 *@Author: wushi
 *@description: 自定义注解
 *@Date: Created in 9:43 2019/5/23
 *@Modify by: wushi
 *@ModifyDate by: 9:43 2019/5/23
 *
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
