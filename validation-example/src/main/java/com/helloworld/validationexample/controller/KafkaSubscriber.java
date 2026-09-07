package com.helloworld.validationexample.controller;

import com.helloworld.validationexample.dto.UserRequest;
import io.dapr.Topic;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaSubscriber {

    @Topic(name = "testroyalmail", pubsubName = "kafka-pubsub")
    @PostMapping("/consume")
    public void consume(@RequestBody UserRequest userRequest){
        System.out.println("kafka message is consumed:::::"+userRequest);
    }
}
