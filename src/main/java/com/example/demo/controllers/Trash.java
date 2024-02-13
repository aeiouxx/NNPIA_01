package com.example.demo.controllers;

import com.example.demo.services.GreetingService;
import com.example.demo.services.IGreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class Trash {
    public IGreetingService _usefulService;
    public Trash() {
        _usefulService = new GreetingService();
    }
}
