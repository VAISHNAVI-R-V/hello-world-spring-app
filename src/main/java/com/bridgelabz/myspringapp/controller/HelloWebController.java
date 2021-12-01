package com.bridgelabz.myspringapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWebController {
   @GetMapping("/web")
    public String hello() {
        return"hello";
    }
}
