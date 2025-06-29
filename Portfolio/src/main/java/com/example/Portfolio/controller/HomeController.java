package com.example.Portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping("/projects")
    public String projects(){
        return"projects";
    }
    @GetMapping("/contacts")
    public String contacts(){
        return "contacts";
    }
}
