package com.hxh.sessioncache.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @Author: H_xinghai
 * @Date: 2019/7/24 10:36
 * @Description: 静态的定时任务 基于cron表达式
 */

//@Component
//@Configuration
//@EnableScheduling
//public class ScheduleConfig {
//    @Scheduled(cron = "0/5 * * * * ?")
//    private void scheduleTask(){
//        System.out.println("执行静态的定时任务，" + LocalDateTime.now());
//    }
//}
