package com.htlv.currencyprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BalanceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BalanceProviderApplication.class, args);
    }
}
