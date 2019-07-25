package com.hxh.sessioncache.service;

import java.util.concurrent.Future;

/**
 * @Author: H_xinghai
 * @Date: 2019/7/22 13:58
 * @Description:
 */

public interface AsyncService {
    /**
    * @Author: H_xinghai on 2019/7/22 14:00
    * @param:
    * @return:
    * @Description: 执行相关的异步任务
    */

    void  writeSomething();

    void  writeSomething2();

    void  writeit();

    Future<String> returnSomething();

    Future<String> returnSomething2();

    Future<String> returnSomething3();
}
