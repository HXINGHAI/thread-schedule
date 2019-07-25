package com.hxh.sessioncache.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Author: H_xinghai
 * @Date: 2019/7/22 13:41
 * @Description: 线程池配置
 */
@Component
@EnableAsync         //线程异步
@Slf4j
public class ExecutorConfig {
    @Bean
    public Executor asyncServiceExecutor(){
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();

        //配置核心线程数
        executor.setCorePoolSize(5);
        //配置最大线程数
        executor.setMaxPoolSize(10);
        //配置队列大小
        executor.setQueueCapacity(400);
        //配置线程池中的线程名称前缀
        executor.setThreadNamePrefix("Thread-");
        //CallerRunsPolicy()表示不在新的线程中执行任务，而是在调用者所在的线程中来执行
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        executor.initialize();
        return executor;
    }
}
