package com.example.greetingapp.controller;

import com.example.greetingapp.model.Greeting;
import com.example.greetingapp.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @Autowired
    private IGreetingService greetingService;
    private final static String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name){
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @GetMapping("/hello")
    public String sayHello(){
        return greetingService.sayHello();
    }

    @GetMapping("/ByName")
    public String greetingWithUserName(@RequestParam(value = "firstName", defaultValue = "") String firstName,
                                       @RequestParam(value = "lastName", defaultValue = "") String lastName) {
        return greetingService.greetingWithName(firstName, lastName);
    }
}