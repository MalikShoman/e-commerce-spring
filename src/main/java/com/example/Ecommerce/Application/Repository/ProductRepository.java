package com.example.Ecommerce.Application.Repository;

import com.example.Ecommerce.Application.Model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Products,Integer> {
}
