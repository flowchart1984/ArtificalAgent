package com.helloworld.validationexample.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    @KafkaListener(topics = "testroyalmail", groupId = "demo-group")
    public void consume(String message) {
        System.out.println("Received Message: " + message);
    }


}
