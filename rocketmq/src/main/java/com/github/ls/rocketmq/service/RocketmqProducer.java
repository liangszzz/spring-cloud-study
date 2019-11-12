package com.github.ls.rocketmq.service;

import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;
import org.springframework.stereotype.Service;

@Service
public class RocketmqProducer {

    DefaultMQProducer producer = new DefaultMQProducer("please_rename_unique_group_name_4");

    public void send(String message) throws MQClientException, RemotingException, InterruptedException, MQBrokerException {
        producer.setNamesrvAddr("localhost:9876");
        try {
            producer.start();
        }
        catch (Exception e){

        }
        Message msg = new Message("TopicCreate1", "TagB", message.getBytes());
        producer.send(msg);
    }

}
