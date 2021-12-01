package com.bridgelabz.myspringapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @Purpose: To Create A Hello REST Controller to print messages.
 *
 * @author : VAISHNAVI R. VISHWAKARMA.
 * @since  : 1-12-2021.
 */
@RestController
public class HelloRestController {
    @RequestMapping("/")
    public String index() {
        return "Hello from BridgeLabz...!!";
    }
}
