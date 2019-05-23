package com.feibai.demo11;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @Author: ${user}
 * @description:
 * @Date: Created in 15:11 2019/5/23
 * @Modfied by: ${user}
 * @Modfied Date by: 15:11 2019/5/23
 */
@Configuration
@ComponentScan("com.feibai.demo11")
@EnableScheduling
public class TaskSchedulerConfig {
}
