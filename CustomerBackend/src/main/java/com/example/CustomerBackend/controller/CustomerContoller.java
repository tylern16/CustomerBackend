package com.example.CustomerBackend.controller;

import com.example.CustomerBackend.enitity.Customer;
import com.example.CustomerBackend.repository.CustomerRepository;
import com.example.CustomerBackend.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerContoller {
    @Autowired
    private CustomerService customerService;

    @Autowired
    private CustomerRepository customerRepository;
   @PostMapping("/addCustomer")
    public Customer addCustomer(@RequestBody Customer customer){
        return customerService.saveCustomer(customer);
    }
   @PostMapping("/addCustomers")
    public List<Customer> addCustomers(@RequestBody List<Customer> customers){
        return customerService.saveCustomers(customers);
    }
    @GetMapping("/customers")
    public List<Customer>findAllCustomers(){
       return customerService.getCustomers();
    }

    @GetMapping("/customer/{id}")
    public Customer findCustomerById( @PathVariable int id){
       return customerService.getCustomerById(id);
    }
//   @GetMapping("/customer/{name}")
//    public Customer findCustomerByName( @PathVariable String name){
//       return customerService.getCustomerByName(name);
//    }

    @PutMapping("/update")
    public Customer updateCustomer(@RequestBody Customer customer){
        return customerService.updateCustomer(customer);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteCustomer ( @PathVariable int id){
       customerService.deleteCustomer(id);
    }

}
