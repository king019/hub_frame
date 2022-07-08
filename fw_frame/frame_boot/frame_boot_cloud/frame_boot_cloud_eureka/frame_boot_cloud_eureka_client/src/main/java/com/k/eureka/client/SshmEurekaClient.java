package com.k.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SshmEurekaClient {

    public static void main(String[] args) {
        SpringApplication.run(SshmEurekaClient.class, args);
    }
}
