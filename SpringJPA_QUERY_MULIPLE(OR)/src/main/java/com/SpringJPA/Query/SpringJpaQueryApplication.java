package com.SpringJPA.Query;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.SpringJPA.Query.Entity.Product;
import com.SpringJPA.Query.Repo.ProductRepo;

@SpringBootApplication
public class SpringJpaQueryApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaQueryApplication.class, args);
	}
	
	@Autowired
	private ProductRepo productRepo;

	@Override
	public void run(String... args) throws Exception {
		
		
		Product p=new Product();
		p.setName("shrikanth");
		p.setDescription("I am Engineer");
		
		Product p1=new Product();
		p1.setName("Namita");
		p1.setDescription("I am a Doctor");
		
		productRepo.saveAll(List.of(p,p1));
		
		List<Product> product=productRepo.findByNameOrDescription("ritvik","I am studnt" );
		
		System.out.println(product.toString());
		
		
	}
	
	
	
	
	

}
