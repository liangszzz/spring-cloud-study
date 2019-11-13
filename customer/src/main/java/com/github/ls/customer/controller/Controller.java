package com.github.ls.customer.controller;

import com.github.ls.customer.service.SpringCloudOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class Controller {

    @Autowired
    private SpringCloudOrderService springCloudOrderService;

    @GetMapping("/index")
    public String index() {
        return springCloudOrderService.index();
    }
}
