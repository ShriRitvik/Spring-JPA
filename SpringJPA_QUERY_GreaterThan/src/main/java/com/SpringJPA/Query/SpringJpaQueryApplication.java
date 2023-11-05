package com.SpringJPA.Query;

import java.math.BigDecimal;
import java.util.Date;
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
		p.setName("shrikanth1256");
		p.setDescription("I am Engineer");
		p.setCreatedDate(new Date());
		p.setUpdatedDate(new Date());
		p.setAge(15);
		p.setPrice(new BigDecimal(50000));
		
		
		Product p1=new Product();
		p1.setName("Namita12356");
		p1.setDescription("I am a Doctor");
		p1.setAge(20);
		p1.setPrice(new BigDecimal(150000));
		
		Product p2=new Product();
		p2.setName("Namita786");
		p2.setDescription("I am a Doctor");
		p2.setAge(25);
		p2.setPrice(new BigDecimal(150000));
		productRepo.saveAll(List.of(p,p1,p2));
		
		List<Product> product=productRepo.findByAgeLessThanEqual(16);
		product.forEach((age)->	{
		System.out.println("Student Laptop Details" + age.getId());
		System.out.println("Student Laptop Details" + age.getName());
		});
		
		List<Product> product1=productRepo.findByAgeGreaterThanEqual(20);
		product1.forEach((age1)->	{
		System.out.println("Student Laptop Details" + age1.getId());
		System.out.println("Student Laptop Details" + age1.getName());
		});
		
	
		
	
		
				
		
		
		
		
	}
	
	
	
	
	

}
