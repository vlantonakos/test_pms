package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, welcome to the demo service!";
    }

    @GetMapping("/greet")
    public String greetUser() {
        return "Greetings! This is a simple demo service.";
    }
}