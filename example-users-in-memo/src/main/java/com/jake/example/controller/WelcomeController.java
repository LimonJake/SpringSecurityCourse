package com.jake.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("welcome")
public class WelcomeController {

    @GetMapping
    public ResponseEntity<String> sayWelcome(){
        return ResponseEntity.ok("Welcome to Spring Application with Security");
    }

}
