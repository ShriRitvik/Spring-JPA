package com.SpringJPA.Query.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringJPA.Query.Entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
