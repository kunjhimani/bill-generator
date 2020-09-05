package com.example.billgenerator.mapper;

import org.springframework.stereotype.Component;

import com.example.billgenerator.dto.ProductDto;
import com.example.billgenerator.entity.Product;

@Component
public class ProductMapper {
	
	public ProductDto mapEntitytoProjectDto(Product product) {
		
		ProductDto productDto=new ProductDto();
		productDto.setId(product.getId());
		productDto.setName(product.getName());
		productDto.setPrice(product.getPrice());
		productDto.setCategory(product.getCategory());
		
		return productDto;
		
	}

}
