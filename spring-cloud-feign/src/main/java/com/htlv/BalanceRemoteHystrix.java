package com.htlv;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
public class BalanceRemoteHystrix implements BalanceRemote {

    @Override
    @RequestMapping(value = "/getUserBalance/{name}", method = RequestMethod.GET)
    public String getUserBalance(@PathVariable("name") String name) {
        return "货币系统异常";
    }
}