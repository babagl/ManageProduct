package com.example.springbootpart2.dto;

import java.util.List;

public class ProductDto {
    private int id;
    private int productNumber;
    private String name;
    private String description;
    private double price;
    private List<StockDto> quantity;
    private List<OrderDto> orderDtos;

    public ProductDto() {
    }

    public ProductDto(int id, int productNumber, String name, String description, double price, List<StockDto> quantity, List<OrderDto> orderDtos) {
        this.id = id;
        this.productNumber = productNumber;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.orderDtos = orderDtos;
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

    public List<StockDto> getQuantity() {
        return quantity;
    }

    public void setQuantity(List<StockDto> quantity) {
        this.quantity = quantity;
    }

    public List<OrderDto> getOrderDtos() {
        return orderDtos;
    }

    public void setOrderDtos(List<OrderDto> orderDtos) {
        this.orderDtos = orderDtos;
    }
}
