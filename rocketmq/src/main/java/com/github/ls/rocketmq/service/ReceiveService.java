package com.github.ls.rocketmq.service;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

public class ReceiveService {

    /**
     * 默认是input，在Sink类中指定，如果想要多个input，需要写一个实现Sink的类
     *
     * @param receiveMsg
     */
    public void receiveInput1(String receiveMsg) {
        System.out.println("input receive: " + receiveMsg);
    }

}
