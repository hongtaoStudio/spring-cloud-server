package com.htlv.currencyprovider;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {

    @RequestMapping(value = "/getUserBalance/{name}", method = RequestMethod.GET)
    public String index(@PathVariable("name") String name) {
        return name + "your balance is empty from 182";
    }
}