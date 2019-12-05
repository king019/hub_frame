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

    @GetMapping("/timedWaiting")
    public String timedWaiting() throws InterruptedException {
        GCUtil.timedWaiting();
        return "";
    }

    @GetMapping("/waiting")
    public String waiting() {
        GCUtil.waiting();
        return "";
    }

    @GetMapping("/blocked")
    public String blocked() {
        GCUtil.blocked();
        return "";
    }

    @GetMapping("/runnable")
    public String runnable() {
        GCUtil.runnable();
        return "";
    }


}
