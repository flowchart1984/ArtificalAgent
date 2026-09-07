package com.helloworld.validationexample.exception;

import com.helloworld.validationexample.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


public class UserNotFoundException extends  Exception{
    String message;
    public UserNotFoundException(String message){
       super(message);
    }
}
