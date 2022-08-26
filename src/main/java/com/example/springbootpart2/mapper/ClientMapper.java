package com.example.springbootpart2.mapper;

import com.example.springbootpart2.dto.ClientDto;
import com.example.springbootpart2.dto.OrderDto;
import com.example.springbootpart2.model.Client;
import com.example.springbootpart2.model.Order;

import java.util.ArrayList;
import java.util.List;

public class ClientMapper implements EntityMapper<ClientDto, Client> {
    OrderMapper orderMapper= new OrderMapper();

    //translate from clientDto to client
    @Override
    public Client toEntity(ClientDto dto) {
        Client client = new Client();
        client.setId(dto.getId());
        client.setFullName(dto.getFullName());
        client.setEmail(dto.getEmail());
        client.setTel(dto.getTel());
        List<Order> ordersList = new ArrayList<>();
        ordersList =orderMapper.toEntity(dto.getOrderDtos());
        client.setOrders(ordersList);
        return client;
    }

    //translate from client  to clientDto
    @Override
    public ClientDto toDto(Client entity) {
        ClientDto clientDto = new ClientDto();
        clientDto.setId(entity.getId());
        clientDto.setFullName(entity.getFullName());
        clientDto.setEmail(entity.getEmail());
        clientDto.setTel(entity.getTel());
        List<OrderDto> ordersListdto = new ArrayList<>();
        ordersListdto =orderMapper.toDto(entity.getOrders());
        clientDto.setOrderDtos(ordersListdto);
        return clientDto;
    }

    @Override
    public List<Client> toEntity(List<ClientDto> dtoList) {
        return null;
    }

    @Override
    public List<ClientDto> toDto(List<Client> entityList) {
        return null;
    }
}
