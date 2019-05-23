package com.feibai.demo3;

import org.springframework.stereotype.Service;

/**
 *@Author: wushi
 *@description: 被拦截类
 *@Date: Created in 9:46 2019/5/23
 *@Modify by: wushi
 *@ModifyDate by: 9:46 2019/5/23
 *
 */
@Service
public class DemoAnnotationService {

    @Action(name = "注解式拦截的add操作")
    public void  add(){}
}
