package com.example.springapi.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingService {

    @RequestMapping("/Hello")
    public String greeting() {
        return "Hello World";
    }


}
