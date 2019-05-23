package com.feibai.demo13;

import org.springframework.stereotype.Service;

/**
 * @Author: ${user}
 * @description:
 * @Date: Created in 16:18 2019/5/23
 * @Modfied by: ${user}
 * @Modfied Date by: 16:18 2019/5/23
 */
@Service
public class DemoService {
    public void outputResult(){
        System.out.println("从组合注解配置照样获得bean");
    }
}
