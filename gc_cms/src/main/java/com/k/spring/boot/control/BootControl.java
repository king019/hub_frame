package com.k.spring.boot.control;

import com.k.spring.common.GCUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class BootControl {
    @GetMapping("/")
    public String home() {
        GCUtil.xm();
        return "";
    }
}
