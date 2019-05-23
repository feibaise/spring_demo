package com.feibai.demo14;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author: ${user}
 * @description:
 * @Date: Created in 16:33 2019/5/23
 * @Modfied by: ${user}
 * @Modfied Date by: 16:33 2019/5/23
 */
public class TestBean {
    @Getter
    @Setter
    private String content;

    public TestBean(String content){
        super();
        this.content = content;
    }


}
