package com.wang.springmvc.controller;

import com.wang.springmvc.entity.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("account")
public class AccountController {

    @RequestMapping(method = RequestMethod.POST)
    public String account(Account account) {
        System.out.println(account);
        return "success";
    }

}
