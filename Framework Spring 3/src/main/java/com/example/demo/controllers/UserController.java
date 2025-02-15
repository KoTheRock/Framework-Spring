package com.example.demo.controllers;

import com.example.demo.domain.User;
import com.example.demo.services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private RegistrationService registrationService;

    @GetMapping
    public List<User> userList(){
        return registrationService.getDataProcessingService().getRepository().getUsers();
    }

    @PostMapping("/body")
    public String userAddFromBody(@RequestBody User user){
        registrationService.getDataProcessingService().getRepository().getUsers().add(user);
        return "User added from body!";
    }
}
