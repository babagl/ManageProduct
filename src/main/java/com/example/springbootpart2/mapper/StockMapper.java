package com.example.springbootpart2.mapper;

import com.example.springbootpart2.dto.StockDto;
import com.example.springbootpart2.model.Product;
import com.example.springbootpart2.model.Stock;
import com.example.springbootpart2.model.Users;

import java.time.LocalDate;
import java.util.List;

public class StockMapper implements EntityMapper<StockDto, Stock>{
    ProductMapper productMapper =  new ProductMapper();
    UserMapper userMapper = new UserMapper();


    //translate from Stock to stockDto
    @Override
    public Stock toEntity(StockDto dto) {
        Stock stock = new Stock();
        stock.setId(stock.getId());
        stock.setDate(LocalDate.parse(dto.getDate()));
        stock.setType(dto.getType());
        List<Product> productList =productMapper.toEntity(dto.getProductDtos());
        stock.setQuantity(productList);
        Users users = userMapper.toEntity(dto.getUserDto());
        stock.setUsers(users);
        return stock;
    }

    @Override
    public StockDto toDto(Stock entity) {
        StockDto stockDto = new StockDto();
        stockDto.setId(entity.getId());
        stockDto.setDate(entity.getDate().toString());
        stockDto.setType(entity.getType());
        stockDto.setProductDtos(productMapper.toDto(entity.getQuantity()));
        stockDto.setUserDto(userMapper.toDto(entity.getUsers()));

        return stockDto;
    }

    @Override
    public List<Stock> toEntity(List<StockDto> dtoList) {
        return null;
    }

    @Override
    public List<StockDto> toDto(List<Stock> entityList) {
        return null;
    }
}
