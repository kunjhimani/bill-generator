package com.example.billgenerator.service;

import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.billgenerator.dao.BillGeneratorDao;
import com.example.billgenerator.dao.BillGeneratorDaoImpl;
import com.example.billgenerator.dto.ProductDto;
import com.example.billgenerator.entity.Image;
import com.example.billgenerator.entity.Product;
import com.example.billgenerator.mapper.ProductMapper;
import com.example.billgenerator.repository.ImageRepository;
import com.example.billgenerator.repository.ProductRepository;

@Component
public class BillGeneratorServiceImpl implements BillGeneratorService {

	@Autowired
	private BillGeneratorDaoImpl billGeneratorDao;

	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	ImageRepository imageRepository;

	@Autowired
	private ProductMapper productMapper;

	public boolean addProduct() {

		return billGeneratorDao.addProduct();

	}

	
	public Optional<Product> getProduct() {
		//System.out.println("details "+);
		return productRepository.findById(1);

	}

}
