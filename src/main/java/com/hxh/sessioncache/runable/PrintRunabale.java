package com.hxh.sessioncache.runable;

/**
 * @Author: H_xinghai
 * @Date: 2019/7/25 14:21
 * @Description:
 */

public class PrintRunabale implements Runnable{

    private String userName;
    private String usersex;
    private Integer springModel;

    public PrintRunabale(String userName, String usersex, Integer springModel) {
        this.userName = userName;
        this.usersex = usersex;
        this.springModel = springModel;
    }

    @Override
    public void run(){
        System.out.println("print线程执行结果："+ userName + " "+ usersex + " " + springModel);
    }
}
