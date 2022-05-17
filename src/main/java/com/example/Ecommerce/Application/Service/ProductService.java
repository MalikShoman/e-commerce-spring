package com.example.Ecommerce.Application.Service;

import com.example.Ecommerce.Application.Model.Products;
import com.example.Ecommerce.Application.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public List<Products> getProducts() {
        return productRepository.findAll();
    }

    public void addProducts(Products products) {
        productRepository.save(products);
    }

    public void deleteProduct(int id) {
        productRepository.deleteById(id);
    }

    public Products getById(int id) {
        return productRepository.findById(id).get();
    }
}
