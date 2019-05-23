package com.feibai.demo5;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;


/**
 *@Author: wushi
 *@description: EL 配置类
 *@Date: Created in 11:09 2019/5/23
 *@Modify by: wushi
 *@ModifyDate by: 11:09 2019/5/23
 *
 */
@Configuration
@ComponentScan("com.feibai.demo5")
@Service
@PropertySource("classpath:com/feibai/demo5/test.properties")
public class ElConfig {

    @Value("I Love You!")
    private String normal;

    @Value("#{systemProperties['os.name']}")
    private String osName;

    @Value("#{T(java.lang.Math).random() * 100.0}")
    private double randomNumber;

    @Value("#{demoService.another}")
    private String fromAnother;

    @Value("classpath:com/feibai/demo5/test.txt")
    private Resource textFile;

    @Value("http://www.baidu.com")
    private Resource textUrl;

    @Value("${book.name}")
    private String bookName;

    @Autowired
    private Environment environment;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigure(){
        return  new PropertySourcesPlaceholderConfigurer();
    }


    public void  outputResource(){
        try {
            System.out.println(normal);
            System.out.println(osName);
            System.out.println(randomNumber);
            System.out.println(fromAnother);
            System.out.println(IOUtils.toString(textFile.getInputStream(),"utf-8"));
            System.out.println(IOUtils.toString(textUrl.getInputStream(),"utf-8"));
            System.out.println(bookName);
            System.out.println(environment.getProperty("book.author"));

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
