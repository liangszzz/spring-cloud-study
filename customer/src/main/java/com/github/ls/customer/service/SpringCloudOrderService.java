package com.github.ls.customer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "spring-cloud-order")
public interface SpringCloudOrderService {

    @GetMapping("/index")
    public String index();
}
