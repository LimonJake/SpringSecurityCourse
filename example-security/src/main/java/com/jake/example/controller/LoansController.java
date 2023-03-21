package com.jake.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myLoans")
public class LoansController {

    @GetMapping
    public ResponseEntity<String> myLoans(){
        return ResponseEntity.ok("My Loans");
    }
}
