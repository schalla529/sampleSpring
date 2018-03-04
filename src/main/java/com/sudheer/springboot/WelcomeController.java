package com.sudheer.springboot;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @RequestMapping("/greeting")
    public String sayGreetings(){
        return "Happy Coding!";
    }

    @RequestMapping("/health")
    public String healthCheck(){
        return "I am working!";
    }
}
