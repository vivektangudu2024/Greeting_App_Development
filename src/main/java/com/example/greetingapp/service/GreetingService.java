package com.example.greetingapp.service;
import org.springframework.stereotype.Service;


@Service
public class GreetingService implements IGreetingService{
    @Override
    public String sayHello() {
        return "Hello!!!";
    }

    @Override
    public String greetingWithName(String firstName, String lastName) {
        if(firstName.isEmpty() && lastName.isEmpty())
            return sayHello();
        else if (!(firstName.equals("")) && (lastName.equals(""))) {
            return "Welcome to the greeting app, "+firstName+"!";
        }
        else if (!(lastName.equals("")) && (firstName.equals(""))) {
            return "Welcome to the greeting app, "+lastName+"!";
        }
        else
        return "Welcome to the greeting app, "+firstName+" "+lastName+"!";
    }
}
