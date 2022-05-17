package com.example.Ecommerce.Application.Repository;

import com.example.Ecommerce.Application.Model.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customers,Integer> {
}
