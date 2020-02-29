package com.k.spring.feign.client;


import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient("feign-server")
public interface StoreClient {
    @GetMapping(  value = "/index")
    String index();
}