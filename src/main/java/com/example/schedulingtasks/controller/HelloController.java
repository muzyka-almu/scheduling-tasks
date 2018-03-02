package com.example.schedulingtasks.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping(value = "/main")
    public String hello(){
        return "Hello world)!";
    }
}
