package com.example.billgenerator.dao;
import com.example.billgenerator.entity.Product;

public interface BillGeneratorDao {
	
	public boolean addProduct();
	public Product getProduct();

}
