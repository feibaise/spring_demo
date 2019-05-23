package com.feibai.demo2;

/**
 *@Author: wushi
 *@description: 使用功能类
 *@Date: Created in 9:13 2019/5/23
 *@Modify by: wushi
 *@ModifyDate by: 9:13 2019/5/23
 *
 */

public class UserFunctionService {


    private FunctionService functionService;

    public void setFunctionService(FunctionService functionService){
        this.functionService = functionService;
    }


    public String SayHello(String word){
        return functionService.sayHello(word);
    }


}
