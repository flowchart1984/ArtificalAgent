package com.helloworld.validationexample.service;

import com.helloworld.validationexample.dto.UserRequest;
import com.helloworld.validationexample.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.helloworld.validationexample.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(UserRequest userRequest){
        User user = User.build(0,userRequest.getName(),
                userRequest.getMobile(),
                userRequest.getGender(),
                userRequest.getAge(),
                userRequest.getNationlity());
        return userRepository.save(user);
    }

    public List<User> getAllUsers(){
       return  userRepository.findAll();
    }

    public User getUser(int id){
      // return userRepository.findByUserId(id);
       return null;
    }
}
