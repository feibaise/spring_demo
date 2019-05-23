package com.feibai.demo14;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: ${user}
 * @description:
 * @Date: Created in 16:39 2019/5/23
 * @Modfied by: ${user}
 * @Modfied Date by: 16:39 2019/5/23
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes ={TestConfig.class})
@ActiveProfiles("prod")
public class DemoBeanIntegrationTests {



    @Autowired
    private TestBean testBean;

    @Test
    public void prodBeanShouldInject(){
        String expected = "from production profile";
        String actual = testBean.getContent();

        Assert.assertEquals(expected,actual);
    }
}
