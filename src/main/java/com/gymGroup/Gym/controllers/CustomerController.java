package com.gymGroup.Gym.controllers;


import com.gymGroup.Gym.models.Customer;
import com.gymGroup.Gym.models.Persistence.CustomerRepository;
import jakarta.persistence.Column;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @GetMapping("/{id}")
    public Customer getClientById(@PathVariable int id) {
        return customerRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Customer createClient(@RequestBody Customer customer) {
        return customerRepository.save(customer);
    }

    @PutMapping("/{id}")
    public Customer updateClient(@PathVariable int id, @RequestBody Customer customerDetails) {
        Customer customer = customerRepository.findById(id).orElse(null);
        if (customer != null) {

            customer.setName(customerDetails.getName());
            customer.setLastName(customerDetails.getLastName());
            customer.setGender(customerDetails.getGender());
            customer.setPhone(customerDetails.getPhone());
            customer.setObjective(customerDetails.getObjective());
            customer.setNameEmergency(customerDetails.getNameEmergency());
            customer.setLastEmergency(customerDetails.getLastEmergency());
            customer.setPhoneEmergency(customerDetails.getPhoneEmergency());
            return customerRepository.save(customer);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable int id) {
        customerRepository.deleteById(id);
    }

}
