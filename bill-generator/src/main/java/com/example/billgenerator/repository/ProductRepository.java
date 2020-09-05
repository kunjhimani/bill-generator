package com.example.billgenerator.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.billgenerator.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>  
{  
}  