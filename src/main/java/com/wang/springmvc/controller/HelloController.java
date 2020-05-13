package com.wang.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;

//控制器类
@Controller
public class HelloController {

    @RequestMapping(path = "/hello")
    public String sayHello(String username, @CookieValue(value="JSESSIONID") String session) {
        System.out.println("hello springmvc总额为");
        System.out.println(username);

        System.out.println("session:" + session);
        return "success";
    }
}
