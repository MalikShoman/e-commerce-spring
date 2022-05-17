package com.example.Ecommerce.Application.Controller;

import com.example.Ecommerce.Application.Model.Customers;
import com.example.Ecommerce.Application.Model.Products;
import com.example.Ecommerce.Application.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Access;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;
    @GetMapping("/getProducts")
    public List<Products> getProducts(){
        return productService.getProducts();
    }
    @GetMapping("/getProduct/{id}")
    public Products getProductsById(@PathVariable  int id){
        return productService.getById(id);
    }
    @PostMapping("/addProducts")
    public void addCustomer(@RequestBody Products products){
        productService.addProducts(products);
    }


}
