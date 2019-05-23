package com.feibai.demo12;


import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @Author: ${user}
 * @description:
 * @Date: Created in 15:58 2019/5/23
 * @Modfied by: ${user}
 * @Modfied Date by: 15:58 2019/5/23
 */
public class WindowsCondition  implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return context.getEnvironment().getProperty("os.name").contains("Windows");
    }
}
