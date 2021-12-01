package com.bridgelabz.myspringapp.controller;

import com.bridgelabz.myspringapp.dto.UserName;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(value = "/hello2")
    public String passQueryParameter
            (@RequestParam(name = "key") String key) {
        return "Hello" + key;
    }

    @GetMapping(value = "/hello2/{name}")
    public String passPathVariable
            (@PathVariable(name = "name") String name) {
        return "Hello" + name;
    }

    @GetMapping(value = "/hello3")
    public String userDTO
            (@RequestBody UserName userDTO) {
        return userDTO.toString();
    }
}
