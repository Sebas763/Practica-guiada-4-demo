package com.example.demo.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dtos.ProductDto;
import com.example.demo.mappers.ProductMapper;
import com.example.demo.services.IProductService;

@Component
public class ProductFacade implements IProductFacade {
    
    @Autowired
    private IProductService productService;
    @Autowired
    private ProductMapper ProductMapper;

    public List<ProductDto> getAll(){
        return ProductMapper.toProductDtoList(productService.getAll());
    }
}
