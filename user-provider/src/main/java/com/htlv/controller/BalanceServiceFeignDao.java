package com.htlv.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "spring-cloud-feign")
public interface BalanceServiceFeignDao {

    @RequestMapping(value = "/getUserBalance/{name}", method = RequestMethod.GET)
    String getUserBalance(@PathVariable("name") String name);
}  