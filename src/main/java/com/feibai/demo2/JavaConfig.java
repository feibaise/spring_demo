package com.feibai.demo2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *@Author: wushi
 *@description: java 配置类
 *@Date: Created in 9:26 2019/5/23
 *@Modify by: wushi
 *@ModifyDate by: 9:26 2019/5/23
 *
 */
@Configuration
public class JavaConfig {

    @Bean
    public FunctionService functionService(){
        return  new FunctionService();
    }

    @Bean
    public UserFunctionService userFunctionService(FunctionService functionService){
        UserFunctionService userFunctionService = new UserFunctionService();
        userFunctionService.setFunctionService(functionService);
        return userFunctionService;
    }

}
