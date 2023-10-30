package com.SpringJPA.Save;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.SpringJPA.Save.Entity.Products;
import com.SpringJPA.Save.Repo.SpringJPASaveRepo;

@SpringBootApplication
public class SpringJpaApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);
		
	}
	
	@Autowired
	private SpringJPASaveRepo springJPARepo;
	

//whenver @identity used its automaticatlly incrmented dont sepcify id 
	@Override
	public void run(String... args) throws Exception {
		Products pro=new Products();
		
		pro.setName("product 3");
		pro.setDescription("product 1 desc");
		pro.setPrice(new BigDecimal(100));
		pro.setSku("product 1 sku");
		pro.setActive(true);
		pro.setImageUrl("product1.png");
		
		
		//SAVE
		springJPARepo.save(pro);
		System.out.println(pro.toString());
        
		
	}

}
