package com.example.Ecommerce.Application.Repository;

import com.example.Ecommerce.Application.Model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Orders,Integer> {
}
