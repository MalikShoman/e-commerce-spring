package com.example.Ecommerce.Application.Service;

import com.example.Ecommerce.Application.Model.Customers;
import com.example.Ecommerce.Application.Model.Orders;
import com.example.Ecommerce.Application.Repository.OrderRepository;
import org.aspectj.weaver.ast.Or;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    public List<Orders> getOrders() {
        return orderRepository.findAll();
    }
    public void addOrders(Orders orders) {
        orderRepository.save(orders);
    }

    public Orders getById(int id) {
        return orderRepository.findById(id).get();
    }
}
