package com.htlv;

import org.springframework.stereotype.Component;

@Component
public class BalanceRemoteHystrix implements BalanceRemote {

    @Override
    public String getUserBalance(String name) {
        return "货币系统异常";
    }
}