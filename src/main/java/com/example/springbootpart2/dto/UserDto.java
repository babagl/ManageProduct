package com.example.springbootpart2.dto;

import java.util.List;

public class UserDto {
    private int id;
    private String username;
    private String password;
    private String role;
    private List<StockDto> stockDtos;

    public UserDto() {
    }

    public UserDto(int id, String username, String password, String role, List<StockDto> stockDtos) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
        this.stockDtos = stockDtos;
    }

    public List<StockDto> getStockDtos() {
        return stockDtos;
    }

    public void setStockDtos(List<StockDto> stockDtos) {
        this.stockDtos = stockDtos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
