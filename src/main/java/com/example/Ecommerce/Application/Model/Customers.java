package com.example.Ecommerce.Application.Model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
* Customers class with all attributes and methods
*
* */
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;


}