package com.example.Ecommerce.Application.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
 * Orders class with all attributes and methods
 *
 * */
@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int Customer_id;
    private int Ammount;
    private String ShippingAddress;
    private String OrderDate;
    private String OrderStatus;

    public Orders(){}
    public Orders(int customer_id, int ammount, String shippingAddress, String orderDate, String orderStatus) {
        Customer_id = customer_id;
        Ammount = ammount;
        ShippingAddress = shippingAddress;
        OrderDate = orderDate;
        OrderStatus = orderStatus;
    }

    public int getID() {
        return id;
    }

    public void setID(int ID) {
        this.id = ID;
    }

    public int getCustomer_id() {
        return Customer_id;
    }

    public void setCustomer_id(int customer_id) {
        Customer_id = customer_id;
    }

    public int getAmmount() {
        return Ammount;
    }

    public void setAmmount(int ammount) {
        Ammount = ammount;
    }

    public String getShippingAddress() {
        return ShippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        ShippingAddress = shippingAddress;
    }

    public String getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(String orderDate) {
        OrderDate = orderDate;
    }

    public String getOrderStatus() {
        return OrderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        OrderStatus = orderStatus;
    }
}
