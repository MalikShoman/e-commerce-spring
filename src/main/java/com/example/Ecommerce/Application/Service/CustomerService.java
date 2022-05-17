package com.example.Ecommerce.Application.Service;

import com.example.Ecommerce.Application.Model.Customers;
import com.example.Ecommerce.Application.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customers> getCustomer() {
        return customerRepository.findAll();
    }

    public void addCustomer(Customers customers) {
        customerRepository.save(customers);
    }

    public Customers getById(int id) {
        return customerRepository.findById(id).get();
    }

    public void  delById(int id) {

         customerRepository.deleteById(id);

    }
}
