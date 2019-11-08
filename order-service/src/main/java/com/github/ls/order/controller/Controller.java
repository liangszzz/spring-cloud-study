package com.github.ls.order.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class Controller {

    @Value("${abc:}")
    private String abb;

    @GetMapping("/index")
    public String index() {
        return "hello " + abb;
    }
}
