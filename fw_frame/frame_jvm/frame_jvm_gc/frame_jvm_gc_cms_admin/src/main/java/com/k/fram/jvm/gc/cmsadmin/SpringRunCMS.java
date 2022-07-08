package com.k.fram.jvm.gc.cmsadmin ;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringRunCMS {
    public static void main(final String[] args) {
        SpringApplication.run(SpringRunCMS.class, args);
    }
}
