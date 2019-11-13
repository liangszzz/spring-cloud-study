package com.github.ls.rocketmq.service;

import com.alibaba.fastjson.JSONObject;
import com.github.ls.rocketmq.mq.MyChannel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
@EnableBinding({MyChannel.class})
public class MqTest1 {

    @Autowired
    private MyChannel myChannel;

    public void send(String message) {
        JSONObject object = new JSONObject();
        object.put("abc", message);
        JSONObject jsonObject = JSONObject.parseObject(object.toJSONString());
        myChannel.output().send(MessageBuilder.withPayload(jsonObject).build());
    }


    @StreamListener(MyChannel.INPUT)
    public void receiveInput1(String receiveMsg) {
        System.out.println("input receive: " + receiveMsg);
    }

}
