package com.feibai.demo7;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author: ${user}
 * @description:
 * @Date: Created in 11:55 2019/5/23
 * @Modfied by: ${user}
 * @Modfied Date by: 11:55 2019/5/23
 */
public class DemoBean {

    @Getter
    @Setter
    private String content;

    public  DemoBean( String content){
        super();
        this.content = content;
    }

}
