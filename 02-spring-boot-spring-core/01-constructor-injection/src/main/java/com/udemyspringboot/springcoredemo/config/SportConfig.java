package com.udemyspringboot.springcoredemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.udemyspringboot.springcoredemo.common.Coach;
import com.udemyspringboot.springcoredemo.common.SwimCoach;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwimCoach();
    }
    
}
