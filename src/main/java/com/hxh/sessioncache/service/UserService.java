package com.hxh.sessioncache.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @Author: H_xinghai
 * @Date: 2019/6/25 15:00
 * @Description:
 */

@Service
public class UserService {

    @Cacheable(value = "keyCache")
    public String UserCache(String key){
        System.out.println("用户密钥：" + key);
        return key;
    }
}
