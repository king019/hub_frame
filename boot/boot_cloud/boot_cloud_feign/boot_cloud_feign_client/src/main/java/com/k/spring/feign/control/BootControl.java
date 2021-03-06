package com.k.spring.feign.control;

import com.k.spring.feign.client.BaiduClient;
import com.k.spring.feign.client.StoreClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class BootControl {
    @Autowired
    private BaiduClient baiduClient;
    @Autowired
    private StoreClient storeClient;

    @GetMapping(value = "/index")
    String index() {
        baiduClient.index();
        return "ok";
    }
}
