package com.k.spring.config.client.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RefreshScope
public class BootControl {
    //@Value("${demo.title}")
    private String hello;
    @GetMapping(value = "/index")
    String index() {
        return "ok";
    }
}
