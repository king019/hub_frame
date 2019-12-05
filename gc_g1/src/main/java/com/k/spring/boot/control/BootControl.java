package com.k.spring.boot.control;

import com.k.spring.boot.util.GCUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class BootControl {
    @GetMapping("/gc")
    public String gc() {
        GCUtil.xm();
        return "";
    }

    @GetMapping("/whiletrue")
    public String whiletrue() {
        GCUtil.whiletrue();
        return "";
    }
}
