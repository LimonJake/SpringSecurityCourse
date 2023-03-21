package com.jake.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myBalance")
public class BalanceController {

    @GetMapping
    public ResponseEntity<String> myBalance(){
        return ResponseEntity.ok("My Balance");
    }

}
