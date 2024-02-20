package com.udemyspringboot.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;

import com.udemyspringboot.springcoredemo.common.Coach;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class DemoController {
    
    // define a private field for dependency
    private Coach myCoach;

    @Autowired
    public DemoController(@Qualifier("aquatic") Coach theCoach){
        System.out.println("In constructor : " + getClass().getSimpleName());
        myCoach = theCoach; 
    }


    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
    
    
}
