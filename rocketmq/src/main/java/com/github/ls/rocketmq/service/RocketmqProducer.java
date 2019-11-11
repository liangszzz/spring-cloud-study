package com.github.ls.rocketmq.service;

import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;
import org.springframework.stereotype.Service;

@Service
public class RocketmqProducer {

    public void send(String message) throws MQClientException, RemotingException, InterruptedException, MQBrokerException {
        DefaultMQProducer producer = new DefaultMQProducer("test_producer_group");
        producer.setNamesrvAddr("192.168.202.129:9876");
        producer.start();
        Message msg = new Message("test-topic", "test-tag", message.getBytes());
        producer.send(msg);
    }

}
