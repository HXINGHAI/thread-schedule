package com.hxh.sessioncache.service.serviceImpl;

import com.hxh.sessioncache.service.AsyncService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;

/**
 * @Author: H_xinghai
 * @Date: 2019/7/22 14:01
 * @Description:
 */
@Service
@Async
public class AsyncServiceImpl implements AsyncService {

    @Override
    public void writeSomething(){
        System.out.println("异步任务1");
    }

    @Override
    public void writeSomething2(){
        System.out.println("异步任务2");
    }

    @Override
    public void writeit() {
        System.out.println("异步任务3");
    }

    /**
    * @Author: H_xinghai on 2019/7/24 8:53
    * @param:
    * @return:
    * @Description: 具有返回值的时候
    */

    @Override
    public Future<String> returnSomething() {
        return new AsyncResult<String>("存在返回结果的异步任务1");
    }

    @Override
    public Future<String> returnSomething2() {
        return new AsyncResult<>("存在返回结果的异步任务2");
    }

    @Override
    public Future<String> returnSomething3() {
        return new AsyncResult<>("存在返回结果的异步任务3");
    }

}
