package com.helloworld.validationexample.controller;

import com.helloworld.validationexample.dto.UserRequest;
import io.dapr.client.DaprClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class KafkaDaprTestController {
    private final DaprClient daprClient;

    @PostMapping("/publish")
    public String publish(){
        UserRequest userRequest = new UserRequest();
        userRequest.setName("Niraj");
        userRequest.setGender("Male");
        userRequest.setMobile("8444868611");
        userRequest.setNationlity("Indian");

        daprClient.publishEvent(
                "kafka-pubsub",
                "testroyalmail",
                userRequest).block();
        return "published";
    }
}
