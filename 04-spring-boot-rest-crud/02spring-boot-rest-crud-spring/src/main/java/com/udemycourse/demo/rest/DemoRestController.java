package com.udemycourse.demo.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/test")
public class DemoRestController {

    //add code for the "/hello" endpoint
    @GetMapping("/hello")
    public String getHello() {
        return "Hello World";
    }
    
    
}
