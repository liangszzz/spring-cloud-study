package com.github.ls.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RefreshScope
@RestController
public class Controller {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/index")
    public String index() {
        String forEntity = restTemplate.getForObject("http://spring-cloud-order/index", String.class);
        return forEntity;
    }
}
