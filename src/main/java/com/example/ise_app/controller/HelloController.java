package com.example.ise_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hi")
    public String hello(){
        return "Hello Bei der Aufgabe Entwicklung eines Buildes und Deploymentsproccess";
    }
    @GetMapping("/ok")
    public String allesOk(){
        return "Alles Ok";
    }
}
