package com.bridgelabz.myspringapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : VAISHNAVI R. VISHWAKARMA.
 * @Purpose: To Create A Hello REST Controller to print messages.
 * @since : 1-12-2021.
 */
@RestController
public class HelloRestController {
    @RequestMapping("/")
    public String index() {
        return "Hello from BridgeLabz...!!";
    }

    @GetMapping(value = "/hello1")
    public String getMethod() {
        return "Hello from bridgelabz";
    }
}
