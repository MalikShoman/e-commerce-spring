package com.example.Ecommerce.Application.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
 * Products class with all attributes and methods
 *
 * */
@Entity
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String QRCode;
    private String Name;
    private double Price;
    private double weight;
    private String depiction;
    private String Category;
    private String CreationDate;
    private String ExpirationDate;

    public Products (){}
    public Products(String QRCode, String name, double price, double weight, String depiction, String category, String creationDate, String expirationDate) {
        this.QRCode = QRCode;
        Name = name;
        Price = price;
        this.weight = weight;
        this.depiction = depiction;

        Category = category;
        CreationDate = creationDate;
        ExpirationDate = expirationDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQRCode() {
        return QRCode;
    }

    public void setQRCode(String QRCode) {
        this.QRCode = QRCode;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getDepiction() {
        return depiction;
    }

    public void setDepiction(String depiction) {
        this.depiction = depiction;
    }


    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getCreationDate() {
        return CreationDate;
    }

    public void setCreationDate(String creationDate) {
        CreationDate = creationDate;
    }

    public String getExpirationDate() {
        return ExpirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        ExpirationDate = expirationDate;
    }
}
