package com.htlv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private BalanceServiceFeignDao balanceServiceFeignDao;

    @RequestMapping(value = "/getUserInfo/{name}", method = RequestMethod.GET)
    public String index(@PathVariable("name") String name) {
        String userBalance = balanceServiceFeignDao.getUserBalance(name);

        return "hello " + name + " " + userBalance;
    }

}