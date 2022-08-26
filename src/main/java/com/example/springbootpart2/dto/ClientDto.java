package com.example.springbootpart2.dto;

import java.util.List;

public class ClientDto {
    private int id;
    private String fullName;
    private String email;
    private int tel;
    private List<OrderDto> orderDtos;

    public ClientDto() {
    }

    public ClientDto(int id, String fullName, String email, int tel, List<OrderDto> orderDtos) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.tel = tel;
        this.orderDtos = orderDtos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public List<OrderDto> getOrderDtos() {
        return orderDtos;
    }

    public void setOrderDtos(List<OrderDto> orderDtos) {
        this.orderDtos = orderDtos;
    }
}
