package com.example.springbootpart2.mapper;

import com.example.springbootpart2.dto.StockDto;
import com.example.springbootpart2.dto.UserDto;
import com.example.springbootpart2.model.Stock;
import com.example.springbootpart2.model.Users;

import java.util.ArrayList;
import java.util.List;

public class UserMapper implements EntityMapper<UserDto, Users>{
    StockMapper stockMapper = new StockMapper();

// translate from User to UserDto
    @Override
    public Users toEntity(UserDto dto) {
        Users users = new Users();
        users.setId(dto.getId());
        users.setUsername(dto.getUsername());
        users.setPassword(dto.getPassword());
        List<Stock> stockList= stockMapper.toEntity(dto.getStockDtos());
        users.setStocks(stockList);
        return users;
    }
// translate from User to UserDto
    @Override
    public UserDto toDto(Users entity) {
        UserDto dto = new UserDto();
        dto.setId(entity.getId());
        dto.setUsername(entity.getUsername());
        dto.setPassword(entity.getPassword());
        List<StockDto>stocks = stockMapper.toDto(entity.getStocks());
        dto.setStockDtos(stocks);
        return dto;
    }
// translate from List<User> to List<UserDto>
    @Override
    public List<Users> toEntity(List<UserDto> dtoList) {
        List<Users> usersList = new ArrayList<>();
        for (UserDto dto : dtoList){
            Users users = toEntity(dto);
            usersList.add(users);
        }
        return usersList;
    }
// translate from List<UserDto> to List<User>
    @Override
    public List<UserDto> toDto(List<Users> entityList) {
        List<UserDto> dtoList = new ArrayList<>();
        for(Users entity: entityList){
            UserDto dto = toDto(entity);
            dtoList.add(dto);
        }
        return dtoList;
    }
}
