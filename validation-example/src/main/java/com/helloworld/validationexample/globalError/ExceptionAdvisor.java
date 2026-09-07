package com.helloworld.validationexample.globalError;

import com.helloworld.validationexample.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;

@RestControllerAdvice
public class ExceptionAdvisor {

    HashMap<String ,String> errorMap = new HashMap<>();

    @ExceptionHandler(UserNotFoundException.class)
    //@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity <String> populateErrorMesssage(UserNotFoundException exception){

       return  ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("USER_NOT_FOUBD");

    }
}
