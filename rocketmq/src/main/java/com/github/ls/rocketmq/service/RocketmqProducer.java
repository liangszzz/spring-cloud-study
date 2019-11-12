package com.github.ls.rocketmq.service;

import org.apache.rocketmq.spring.support.RocketMQHeaders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Service
@EnableBinding(Source.class)
public class RocketmqProducer {

    @Autowired
    private Source source;

    public void send(String message) {
        MessageBuilder builder = MessageBuilder.withPayload(message)
                .setHeader(RocketMQHeaders.TAGS, "binder")
                .setHeader(RocketMQHeaders.KEYS, "my-key")
                .setHeader("DELAY", "1");
        Message msg = builder.build();
        source.output().send(msg);
    }

}
