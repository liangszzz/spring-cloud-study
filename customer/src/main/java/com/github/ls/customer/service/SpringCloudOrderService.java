package com.github.ls.customer.service;

import com.github.ls.customer.service.fallBack.SpringCloudOrderServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "spring-cloud-order", fallback = SpringCloudOrderServiceFallBack.class)
public interface SpringCloudOrderService {

    @GetMapping("/index")
    public String index();
}
