package com.example.demo.controllers;

import com.example.demo.services.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class IdkTrash {
    public IGreetingService _greetingService;

    @Autowired
    public void setGreetingService(IGreetingService greetingService) {
        _greetingService = greetingService;
    }

}
