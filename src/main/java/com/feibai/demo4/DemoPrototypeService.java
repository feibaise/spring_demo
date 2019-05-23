package com.feibai.demo4;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 *@Author: wushi
 *@description: 每次调用新建一个bean
 *@Date: Created in 11:00 2019/5/23
 *@Modify by: wushi
 *@ModifyDate by: 11:00 2019/5/23
 *
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {
}
