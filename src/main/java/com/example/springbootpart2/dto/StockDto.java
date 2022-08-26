package com.example.springbootpart2.dto;

import java.util.List;

public class StockDto {
    private int id;
    private String date;
    private String type;
    private List<ProductDto> productDtos;
    private UserDto userDto;

    public StockDto() {
    }

    public StockDto(int id, String date, String type, List<ProductDto> productDtos, UserDto userDto) {
        this.id = id;
        this.date = date;
        this.type = type;
        this.productDtos = productDtos;
        this.userDto = userDto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<ProductDto> getProductDtos() {
        return productDtos;
    }

    public void setProductDtos(List<ProductDto> productDtos) {
        this.productDtos = productDtos;
    }

    public UserDto getUserDto() {
        return userDto;
    }

    public void setUserDto(UserDto userDto) {
        this.userDto = userDto;
    }
}
