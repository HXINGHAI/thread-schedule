package com.hxh.sessioncache.controller;

import com.hxh.sessioncache.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: H_xinghai
 * @Date: 2019/6/25 14:59
 * @Description:
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;


    @RequestMapping("/cache")
    public String userCache(@RequestParam String key){
        String result = userService.UserCache(key);
        return result;
    }


    @RequestMapping("/getSessiono")
    public Map<String,String> getSession(HttpServletRequest req){
        Map<String,String> map = new HashMap<>();
        req.getSession().setAttribute("message",req.getRequestURI());
        map.put("message",req.getRequestURI());
        System.out.println("SessionID = :" + req.getSession().getId());
        return map;
    }

 }
