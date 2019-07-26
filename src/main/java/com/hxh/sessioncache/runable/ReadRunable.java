package com.hxh.sessioncache.runable;

/**
 * @Author: H_xinghai
 * @Date: 2019/7/25 14:27
 * @Description:
 */

public class ReadRunable implements Runnable{

    private String userName;
    private String userWork;
    private Integer userCount;

    public ReadRunable(String userName, String userWork, Integer userCount) {
        this.userName = userName;
        this.userWork = userWork;
        this.userCount = userCount;
    }

    @Override
    public void run(){
        System.out.println("read线程执行结果：" + userName + " " + userWork + " " + userCount);
    }
}
