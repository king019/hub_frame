package com.k.fram.jvm.gc.g1admin ;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringRunG1 {
    public static void main(final String[] args) {
        SpringApplication.run(SpringRunG1.class, args);
    }
}
