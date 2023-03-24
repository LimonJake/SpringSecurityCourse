package com.jake.example.controller;

import com.jake.example.entities.Customer;
import com.jake.example.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping
    public ResponseEntity<Customer> newCustomer(@RequestBody Customer customer){
        return new ResponseEntity<>(customerService.createNewCustomer(customer),
                HttpStatus.CREATED);
    }

}
