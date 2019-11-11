package com.github.ls.rocketmq.controller;

import com.github.ls.rocketmq.service.RocketmqProducer;
import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.remoting.exception.RemotingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class Controller {

    @Autowired
    private RocketmqProducer rocketmqProducer;

    @GetMapping("/index/{msg}")
    public String index(@PathVariable String msg) throws InterruptedException, RemotingException, MQClientException, MQBrokerException {
        rocketmqProducer.send(msg);
        return "hello mq";
    }
}
