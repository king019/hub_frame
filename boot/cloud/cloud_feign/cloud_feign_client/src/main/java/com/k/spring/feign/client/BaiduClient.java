package com.k.spring.feign.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "baidu",url = "https://www.baidu.com")
public interface BaiduClient {
    @GetMapping(value = "/index")
    String index();
}