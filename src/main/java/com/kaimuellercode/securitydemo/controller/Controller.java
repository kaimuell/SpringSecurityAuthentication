package com.kaimuellercode.securitydemo.controller;

import com.kaimuellercode.securitydemo.security.UserPrinciple;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
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
        public String secured(@AuthenticationPrincipal UserPrinciple principle){
        return "Successfully logged in! Hello User " + principle.getEmail()
                + " with ID : " + principle.getUserId();
    }
}
