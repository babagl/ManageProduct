package com.example.springbootpart2.dto;

import java.util.List;

public class OrderDto {
    private int id;
    private String date;
    private String status;
    private ClientDto clientDto;
    private List<ProductDto> productDtos;

    public OrderDto() {
    }

    public OrderDto(int id, String date, String status, ClientDto clientDto, List<ProductDto> productDtos) {
        this.id = id;
        this.date = date;
        this.status = status;
        this.clientDto = clientDto;
        this.productDtos = productDtos;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ClientDto getClientDto() {
        return clientDto;
    }

    public void setClientDto(ClientDto clientDto) {
        this.clientDto = clientDto;
    }

    public List<ProductDto> getProductDtos() {
        return productDtos;
    }

    public void setProductDtos(List<ProductDto> productDtos) {
        this.productDtos = productDtos;
    }
}
