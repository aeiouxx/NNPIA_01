package com.example.demo.controllers;

import com.example.demo.services.GreetingService;
import com.example.demo.services.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


@Controller
public class LessTrash {
    @Autowired
    public GreetingService _service;
}
