package com.example.greetingapp.service;
import org.springframework.stereotype.Service;


@Service
public class GreetingService implements IGreetingService{
    @Override
    public String sayHello() {
        return "Hello!!!";
    }
}
