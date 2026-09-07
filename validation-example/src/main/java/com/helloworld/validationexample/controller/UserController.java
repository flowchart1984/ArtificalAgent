package com.helloworld.validationexample.controller;

import com.helloworld.validationexample.dto.UserRequest;
import com.helloworld.validationexample.entity.User;
import com.helloworld.validationexample.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.helloworld.validationexample.service.KafkaProducer;
import com.helloworld.validationexample.service.UserService;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    private final KafkaProducer producer;

    public UserController(KafkaProducer producer){
        this.producer = producer;
    }

   /* @PostMapping("/publish")
    public String publish(@RequestParam String message){
        producer.sendMessage(message);
        return "Message sent";
    }*/

    @PostMapping("/signup")
    public ResponseEntity<User> saveUser(@RequestBody UserRequest userRequest){
       return new ResponseEntity<>(userService.saveUser(userRequest), HttpStatus.OK);
    }

    @GetMapping("/fetchAll")
    public ResponseEntity<List<User>> getAllUser(){
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable int id) throws UserNotFoundException {
        Optional.ofNullable(userService.getUser(id)).orElseThrow(()-> new UserNotFoundException("USER_NOT_FOUND"));


        return ResponseEntity.ok(userService.getUser(id));
    }

}
