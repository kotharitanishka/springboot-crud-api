package com.udemyspringboot.mycoolapp.Rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class FunRestController {
    
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!" ;
    }
    
}
