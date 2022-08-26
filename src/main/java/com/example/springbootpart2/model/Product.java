package com.example.springbootpart2.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int productNumber;
    private String name;
    private String description;
    private double price;
    @ManyToMany
    private List<Stock> quantity;
    @ManyToMany
    private List<Order> orders ;


    public Product() {
    }


    public Product(int id, int productNumber, String name, String description, double price, List<Stock> quantity) {
        this.id = id;
        this.productNumber = productNumber;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Stock> getQuantity() {
        return quantity;
    }

    public void setQuantity(List<Stock> quantity) {
        this.quantity = quantity;
    }
}
