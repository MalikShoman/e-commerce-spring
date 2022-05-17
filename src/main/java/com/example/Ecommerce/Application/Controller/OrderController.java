package com.example.Ecommerce.Application.Controller;

import com.example.Ecommerce.Application.Model.Customers;
import com.example.Ecommerce.Application.Model.Orders;
import com.example.Ecommerce.Application.Model.Products;
import com.example.Ecommerce.Application.Service.OrderService;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;
    @GetMapping("/getOrders")
    public List<Orders> getOrders(){
        return orderService.getOrders();
    }
    @GetMapping("/getOrder/{id}")
    public Orders getOrdersById(@PathVariable  int id){
        return orderService.getById(id);
    }
    @PostMapping("/addOrder")
    public void addOrder(@RequestBody Orders orders){
        orderService.addOrders(orders);
    }
}
