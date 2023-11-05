package com.SpringJPA.Query.Repo;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringJPA.Query.Entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

	/**
	 * Returns the found product entry whose title or description is given as a
	 * method parameter. If no product entry is found, this method returns an empty
	 * list.
	 */
	
	//always declre in public
	public List<Product> findByCreatedDateBetween( Date startDate, Date endDate);
	                     //findBy(From entity vatriable (price))OrBetween(datatype variable name) 
}                          //eg:private int price
