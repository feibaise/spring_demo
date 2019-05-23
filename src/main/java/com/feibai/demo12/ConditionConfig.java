package com.feibai.demo12;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: ${user}
 * @description:
 * @Date: Created in 16:05 2019/5/23
 * @Modfied by: ${user}
 * @Modfied Date by: 16:05 2019/5/23
 */
@Configuration
public class ConditionConfig {

    @Bean
    @Conditional(WindowsCondition.class)
    public ListService windowsListService(){
        return new WindowsListService();
    }


    @Bean
    @Conditional(LinuxCondition.class)
    public ListService linuxListService(){
        return new LinuxListService();
    }

}
