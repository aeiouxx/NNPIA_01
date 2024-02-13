package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingService implements IGreetingService {
    @Override
    public void sayGreeting() {
        System.out.println("Amazing useful");
    }
}
