package com.github.ls.rocketmq.controller;

import com.github.ls.rocketmq.service.MqTest1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class Controller {

    @Autowired
    private MqTest1 mqTest1;

    @GetMapping("/index/{msg}")
    public String index(@PathVariable String msg) {
        mqTest1.send(msg);
        return "hello mq";
    }
}
