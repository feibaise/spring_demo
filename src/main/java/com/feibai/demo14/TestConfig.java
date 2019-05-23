package com.feibai.demo14;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @Author: ${user}
 * @description:
 * @Date: Created in 16:37 2019/5/23
 * @Modfied by: ${user}
 * @Modfied Date by: 16:37 2019/5/23
 */
@Configuration
public class TestConfig {

    @Bean
    @Profile("dev")
    public TestBean devTestBean(){
        return  new TestBean("from development profile");
    }



    @Bean
    @Profile("prod")
    public TestBean prodTestBean(){
        return  new TestBean("from production profile");
    }




}
