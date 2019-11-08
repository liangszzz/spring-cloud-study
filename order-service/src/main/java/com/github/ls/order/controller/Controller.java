package com.github.ls.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/index")
    public String index() {
        return "hello gateway";
    }
}
