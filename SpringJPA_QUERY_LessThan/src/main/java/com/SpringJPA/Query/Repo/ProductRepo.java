package com.SpringJPA.Query.Repo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringJPA.Query.Entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {


	
	//always declre in public
	public List<Product> findByPriceLessThan( BigDecimal price);
	                     //findBy(From entity vatriable (price))OrLessThan(datatype variable name) 
}                          //eg:private int price
