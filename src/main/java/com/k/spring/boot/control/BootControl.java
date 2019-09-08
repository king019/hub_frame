package com.k.spring.boot.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/")
public class BootControl {
    @PostMapping("/")
    @ResponseBody
    public String home() {
        return "";
    }
}
