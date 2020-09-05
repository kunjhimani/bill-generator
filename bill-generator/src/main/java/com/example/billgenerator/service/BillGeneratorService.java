package com.example.billgenerator.service;


import java.util.Optional;

import com.example.billgenerator.dto.ProductDto;
import com.example.billgenerator.entity.Product;
import com.example.billgenerator.mapper.ProductMapper;

public interface BillGeneratorService {
	
	public boolean addProduct();
	
	public Optional<Product> getProduct();

}
