package com.example.springapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping("/")
    public String getGreeting() {
        return "Nice practice today";
    }

    @RequestMapping("/greeting")
    public String getMoreFun() {
        return "Let's have fun";
    }
}
