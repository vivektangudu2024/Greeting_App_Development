package com.example.greetingapp.service;

import com.example.greetingapp.model.Greeting;

public interface IGreetingService {

    String sayHello();

    String greetingWithName(String firstName, String lastName);

    Greeting saveGreetings(Greeting greeting);
}
