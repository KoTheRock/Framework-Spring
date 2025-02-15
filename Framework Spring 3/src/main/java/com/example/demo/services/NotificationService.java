package com.example.demo.services;

import com.example.demo.domain.User;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public void notifyuser(User user){
        System.out.println("A new user has been crated: " + user.getName());
    }
}
