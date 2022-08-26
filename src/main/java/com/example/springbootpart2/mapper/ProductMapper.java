package com.example.springbootpart2.mapper;

import com.example.springbootpart2.dto.OrderDto;
import com.example.springbootpart2.dto.ProductDto;
import com.example.springbootpart2.model.Order;
import com.example.springbootpart2.model.Product;
import com.example.springbootpart2.model.Stock;

import java.util.List;

public class ProductMapper implements EntityMapper<ProductDto, Product> {
    StockMapper stockMapper = new StockMapper();
    OrderMapper orderMapper= new OrderMapper();


    //translate ProductDto to product
    @Override
    public Product toEntity(ProductDto dto) {
        Product product = new Product();
        product.setId(dto.getId());
        product.setName(dto.getName());
        product.setDescription(dto.getDescription());
        product.setProductNumber(dto.getProductNumber());
        product.setPrice(dto.getPrice());
        List<Stock> stockList = stockMapper.toEntity(dto.getQuantity());
        product.setQuantity(stockList);
        List<Order> orderList =orderMapper.toEntity(dto.getOrderDtos());
        product.setOrders(orderList);
        return product;
    }

    //Translate Product to ProductDto
    @Override
    public ProductDto toDto(Product entity) {
        ProductDto productDto = new ProductDto();
        productDto.setName(entity.getName());
        productDto.setId(entity.getId());
        productDto.setDescription(entity.getDescription());
        productDto.setProductNumber(entity.getProductNumber());
        productDto.setPrice(entity.getPrice());
        productDto.setQuantity(stockMapper.toDto(entity.getQuantity()));
        productDto.setOrderDtos(orderMapper.toDto(entity.getOrders()));
        return productDto;
    }

    @Override
    public List<Product> toEntity(List<ProductDto> dtoList) {
        return null;
    }

    @Override
    public List<ProductDto> toDto(List<Product> entityList) {
        return null;
    }
}
