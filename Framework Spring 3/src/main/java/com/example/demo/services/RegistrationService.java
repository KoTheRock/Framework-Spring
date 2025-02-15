package com.example.demo.services;

import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    private NotificationService notificationService;

    private UserService userService;
    public UserService getUserService() {
        return userService;
    }

    private DataProcessingService dataProcessingService;

    public DataProcessingService getDataProcessingService() {
        return dataProcessingService;
    }

    //Я правильно понимаю что пользователя мы должны создавать тут? Я не вижу другого более подходящего класса.
    public void processRegistration(String name, int age, String email){
        User newUser = userService.createUser(name, age, email);
        dataProcessingService.addUserToList(newUser);
    }

}
