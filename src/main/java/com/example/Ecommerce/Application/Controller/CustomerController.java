package com.example.Ecommerce.Application.Controller;

import com.example.Ecommerce.Application.Model.Customers;
import com.example.Ecommerce.Application.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/Customers")
    public List<Customers> getCustomers(){
        return customerService.getCustomer();
    }

    @GetMapping("/Customer/{id}")
    public Customers getCustomersById(@PathVariable int id){
        return customerService.getById(id);
    }
    @PostMapping("/addCustomer")
    public void addCustomer(@RequestBody Customers customers){

        customerService.addCustomer(customers);
    }

    @DeleteMapping("/delCustomer/{id}")
    public void delCustomer(@PathVariable int id) {
         customerService.delById(id);
    }

}
