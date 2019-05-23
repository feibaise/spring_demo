package com.feibai.demo1;

import org.springframework.stereotype.Service;

/**
 *@Author: wushi
 *@description: 功能类
 *@Date: Created in 9:10 2019/5/23
 *@Modify by: wushi
 *@ModifyDate by: 9:10 2019/5/23
 *
 */
@Service
public class FunctionService {
    public String sayHello(String word){
        return "Hello:" + word + "!";
    }
}
