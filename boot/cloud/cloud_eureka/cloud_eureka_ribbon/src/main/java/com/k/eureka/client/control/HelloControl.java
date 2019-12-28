package com.k.eureka.client.control;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
public class HelloControl {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/index")
    private String index() {
        return restTemplate.getForEntity("http://feign-server/index", String.class).getBody();
    }
}
