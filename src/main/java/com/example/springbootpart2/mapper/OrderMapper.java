package com.example.springbootpart2.mapper;

import com.example.springbootpart2.dto.OrderDto;
import com.example.springbootpart2.model.Order;

import java.time.LocalDate;
import java.util.List;

public class OrderMapper implements EntityMapper<OrderDto, Order>{
    ClientMapper clientMapper=new ClientMapper();
    ProductMapper productMapper = new ProductMapper();

   //from order to orderdto
    @Override
    public Order toEntity(OrderDto dto) {
        Order order = new Order();
        order.setId(dto.getId());
        order.setDate(LocalDate.parse(dto.getDate()));
        order.setStatus(dto.getStatus());
        order.setProducts(productMapper.toEntity(dto.getProductDtos()));
        order.setClient(clientMapper.toEntity(dto.getClientDto()));
        return order;
    }
// translator from orderDto to order
    @Override
    public OrderDto toDto(Order entity) {
        OrderDto dto = new OrderDto();
        dto.setId(entity.getId());
        dto.setDate(entity.getDate().toString());
        dto.setStatus(entity.getStatus());
        dto.setProductDtos(productMapper.toDto(entity.getProducts()));
        dto.setClientDto(clientMapper.toDto(entity.getClient()));
        return dto;
    }

    @Override
    public List<Order> toEntity(List<OrderDto> dtoList) {
        return null;
    }

    @Override
    public List<OrderDto> toDto(List<Order> entityList) {
        return null;
    }
}
