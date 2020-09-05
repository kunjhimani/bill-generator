package com.example.billgenerator.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.stereotype.Component;
import com.example.billgenerator.entity.Product;

@Component
public class BillGeneratorDaoImpl {
	
	@PersistenceContext
    private EntityManager entityManager;
	
	public boolean addProduct() {
		Criteria criteria = entityManager.unwrap(Session.class).createCriteria(Product.class);
		return true;
	}
	
	public Product getProduct() {
		Criteria criteria = entityManager.unwrap(Session.class).createCriteria(Product.class);
		List<Object> tt=  criteria.list();
		System.out.println("prody=uct i got "+tt.size());
		return (Product)tt;
		
	}

}
