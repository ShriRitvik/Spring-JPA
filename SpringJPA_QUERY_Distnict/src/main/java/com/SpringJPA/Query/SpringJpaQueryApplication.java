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
		// TODO Auto-generated method stub
		
		
		Product p=new Product();
		p.setName("ritu");
		p.setDescription("playing");
		p.setlname("m");
		
		Product p1=new Product();
		p1.setName("ritvikikk");
		p1.setDescription("playing a ball");
		p1.setlname("Ma");
		productRepo.saveAll(List.of(p,p1));
		
		
		List<Product> andProduct=productRepo.findByNameAndLname("ritu","m");
		
		andProduct.forEach((pp) ->
        System.out.println(pp.getName()));
		
	}
	
	

}
