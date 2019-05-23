package com.feibai.demo3;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 *@Author: wushi
 *@description: 配置类
 *@Date: Created in 10:06 2019/5/23
 *@Modify by: wushi
 *@ModifyDate by: 10:06 2019/5/23
 *
 */
@Configuration
@ComponentScan("com.feibai.demo3")
@EnableAspectJAutoProxy
public class AopConfig {
}
