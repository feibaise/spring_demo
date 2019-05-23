package com.feibai.demo10;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @Author: ${user}
 * @description:
 * @Date: Created in 14:51 2019/5/23
 * @Modfied by: ${user}
 * @Modfied Date by: 14:51 2019/5/23
 */


@Service
public class AsyncTaskService {

    @Async
    public  void  executeAsyncTask(Integer i){
        System.out.println("执行异步任务: "+ i);
    }
    @Async
    public void  executeAsyncTaskPlus(Integer i){
        System.out.println("执行一部任务+1: "+(i+1));
    }
}
