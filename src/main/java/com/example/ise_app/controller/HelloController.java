package com.example.ise_app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final String greeting;

    public HelloController(@Value("${GREETING:Hallo ISE mohammed und rania 🚀}") String greeting) {
        this.greeting = greeting;
    }

    @GetMapping("/api/hello")
    public String hello() {
        return greeting;
    }
}