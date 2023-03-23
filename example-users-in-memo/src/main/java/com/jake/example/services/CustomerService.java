package com.jake.example.services;

import com.jake.example.entities.Customer;
import com.jake.example.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer createNewCustomer(Customer customer){
        return customerRepository.save(customer);
    }

}
