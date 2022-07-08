package com.k.eureka.client.control;

import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

@Slf4j
@RestController
public class HelloControl {

    @Autowired
    private DiscoveryClient client;

    //@Bean
    //@LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @RequestMapping("/index")
    private Map<String, String> index() {
        log.info("index");
        List<ServiceInstance> instances = client.getInstances("sleuth_server");
        for (ServiceInstance instance : instances) {
            restTemplate().getForEntity("http://127.0.0.1:8806/index2", Map.class).getBody();
            log.info("host:{},serviceid:{}", instance.getHost(), instance.getServiceId());
        }
        return Maps.newHashMap();
        //return
    }

    @RequestMapping("/index2")
    private Map<String, String> index2() {
        List<String> services = client.getServices();
        //ServiceInstance instance = client.getLocalServiceInstance();
        //log.info("host:{},serviceid:{}", instance.getHost(), instance.getServiceId());
        return Maps.newHashMap();
    }
}
