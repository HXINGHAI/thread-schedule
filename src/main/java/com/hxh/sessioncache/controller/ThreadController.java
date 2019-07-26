package com.hxh.sessioncache.controller;

import com.hxh.sessioncache.runable.PrintRunabale;
import com.hxh.sessioncache.runable.ReadRunable;
import com.hxh.sessioncache.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.Future;


/**
 * @Author: H_xinghai
 * @Date: 2019/7/23 11:02
 * @Description:
 */
@RestController
@RequestMapping("thread")
public class ThreadController {

    @Autowired
    private AsyncService service;

    @Resource
    private ThreadPoolTaskExecutor executor;
    @RequestMapping("ass")
    public String getThread(){
        for (int i = 0; i < 20; i++) {
            service.writeSomething();
            service.writeSomething2();
            service.writeit();
        }
        return "success";
    }

    //存在返回结果的异步任务
    @RequestMapping("res")
    public String getReturnThread(){
        Future<String> str1 = service.returnSomething();
        Future<String> str2 = service.returnSomething2();
        Future<String> str3 = service.returnSomething3();

        for (;;){
            if (str1.isDone() && str2.isDone() && str3.isDone()){
                break;
            }
//            String []a = {"",""};
//            a.
        }
      return "success";
    }

//    更加直接的开启线程方式

    @RequestMapping("/runable")
    public String getRunable(){
        for (int i = 0; i < 10; i++) {
           executor.execute(new PrintRunabale("JAVA","男",2000));
            executor.execute(new ReadRunable("GO","高并发",5000));
        }
        return "success";
    }
}
