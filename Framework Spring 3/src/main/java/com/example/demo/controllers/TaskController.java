package com.example.demo.controllers;


import com.example.demo.domain.User;
import com.example.demo.services.DataProcessingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {
    @Autowired
    private DataProcessingService dataProcessingService;

    @GetMapping
    public List<String> getAllTasks(){
        List<String> tasks = new ArrayList<>();
        tasks.add("sort");
        tasks.add("filter");
        tasks.add("calc");
        return tasks;
    }

    @GetMapping("/sort")
    public List<User> sortUsersByAge(){
        return dataProcessingService.sortUsersByAge(dataProcessingService.getRepository().getUsers());
    }

    @GetMapping("/filter/{age}")
    public List<User> filterUsersByAge(@PathVariable int age){
        return dataProcessingService.filterUsersByAge(dataProcessingService.getRepository().getUsers(), age);
    }


    @GetMapping("/calc")
    public double CalculateAverageAge(){
        return dataProcessingService.calculateAverageAge(dataProcessingService.getRepository().getUsers());
    }
}
