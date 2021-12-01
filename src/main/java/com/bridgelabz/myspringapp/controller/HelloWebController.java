package com.bridgelabz.myspringapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
/**
 * @Purpose: To Create A Hello Web Controller to print messages.
 *
 * @author : VAISHNAVI R. VISHWAKARMA.
 * @since  : 1-12-2021.
 */
@Controller
public class HelloWebController {
    @GetMapping("/web")
    public String hello() {
        return "hello";
    }

    @GetMapping("/web/message")
    public String message(Model model) {
        model.addAttribute("message","This is a custom message");
        return "message";
    }
}
