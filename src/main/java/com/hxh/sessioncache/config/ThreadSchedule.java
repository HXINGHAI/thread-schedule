//package com.hxh.sessioncache.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.scheduling.annotation.Async;
//import org.springframework.scheduling.annotation.EnableAsync;
//import org.springframework.scheduling.annotation.EnableScheduling;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//
///**
// * @Author: H_xinghai
// * @Date: 2019/7/24 11:03
// * @Description: 多线程定时任务，这种的应该是最好没有返回值的   像是个配置类
// */
//@Component
//@EnableScheduling
//@EnableAsync
//public class ThreadSchedule {
//
//    @Async
//    @Scheduled(cron = "0/2 * * * * ?")
//    public void thread1(){
//        //具体的定时任务流程1   比如说定期的查询数据库中会员过期  判断会员到期时间是否小于等于当前时间
//        System.out.println("第一个线程");
//    }
//
//    @Async
//    @Scheduled(cron = "0/3 * * * * ?")
//    public void thread2(){
//        //具体的定时任务流程2
//        System.out.println("第二个线程");
//    }
//
//}
