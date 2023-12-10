package com.kaimuellercode.securitydemo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Controller {
    @GetMapping
    public String Greeting(){
        return("Hello World");
    }

    @GetMapping("/secured")
        public String secured(){
        return "Successfully logged in!";
    }
}
