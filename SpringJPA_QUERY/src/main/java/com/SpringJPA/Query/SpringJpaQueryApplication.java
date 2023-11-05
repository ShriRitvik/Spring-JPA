package com.SpringJPA.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.SpringJPA.Query.Repo.ProductRepo;

@SpringBootApplication
public class SpringJpaQueryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaQueryApplication.class, args);
	}
	
	@Autowired
	private ProductRepo productRepo;
	
	

}
