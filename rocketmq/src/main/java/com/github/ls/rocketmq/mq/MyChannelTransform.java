package com.github.ls.rocketmq.mq;

import com.alibaba.fastjson.JSONObject;
import org.springframework.integration.annotation.Transformer;
import org.springframework.stereotype.Component;

@Component
public class MyChannelTransform {


    @Transformer(inputChannel = MyChannel.INPUT, outputChannel = MyChannel.OUTPUT,autoStartup = "true")
    public String transform(JSONObject msg) {
        return msg.toJSONString() + "####";
    }

}
