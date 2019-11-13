package com.github.ls.customer.service.fallBack;

import com.github.ls.customer.service.SpringCloudOrderService;
import org.springframework.stereotype.Component;

@Component
public class SpringCloudOrderServiceFallBack implements SpringCloudOrderService {

    @Override
    public String index() {
        return "网络异常!";
    }
}
