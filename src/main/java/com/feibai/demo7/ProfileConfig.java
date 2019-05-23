package com.feibai.demo7;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @Author: ${user}
 * @description: 配置文件
 * @Date: Created in 11:58 2019/5/23
 * @Modfied by: ${user}
 * @Modfied Date by: 11:58 2019/5/23
 */
@Configuration
public class ProfileConfig {



    @Bean
    @Profile("dev")
    public DemoBean devDemoBean(){
        return  new DemoBean("from development profile");
    }



    @Bean
    @Profile("prod")
    public DemoBean prodDemoBean(){
        return  new DemoBean("from production profile");
    }
}
