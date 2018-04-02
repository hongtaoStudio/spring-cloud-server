package com.htlv;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "balance-provider", fallback = BalanceRemoteHystrix.class)
public interface BalanceRemote {

    @RequestMapping(value = "/getUserBalance/{name}", method = RequestMethod.GET)
    String getUserBalance(@PathVariable("name") String name);
}