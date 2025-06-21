package org.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.example.User.User;
import org.example.services.Userservices;

@RestController
public class Mycontroller {

    @Autowired
    private Userservices userservices;


    @PostMapping("/user")
    public User addUserDetails(@RequestBody User user)
    {
        System.out.println(" ");
        return userservices.createUser(user);



    }
}

S