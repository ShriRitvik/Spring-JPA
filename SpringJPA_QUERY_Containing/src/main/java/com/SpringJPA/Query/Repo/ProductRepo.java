package com.SpringJPA.Query.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringJPA.Query.Entity.Product;

//always declare class name
public interface ProductRepo extends JpaRepository<Product, Integer> {
	
	
	/**
	 * Return the distinct product entries whose name is given as a method parameter
	 *  If no product entry is found, this method returns null.
	 */
	
	public Product findByNameContaining(String title);
	

}
