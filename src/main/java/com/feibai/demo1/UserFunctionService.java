package com.feibai.demo1;

import com.feibai.demo2.FunctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *@Author: wushi
 *@description: 使用功能类
 *@Date: Created in 9:13 2019/5/23
 *@Modify by: wushi
 *@ModifyDate by: 9:13 2019/5/23
 *
 */
@Service
public class UserFunctionService {


    @Autowired
    private FunctionService functionService;


    public String SayHello(String word){
        return functionService.sayHello(word);
    }


}
