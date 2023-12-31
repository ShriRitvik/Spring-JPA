package com.SpringJPA.SaveAll;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.SpringJPA.SaveAll.Entity.ProductSaveAll;
import com.SpringJPA.SaveAll.repo.SpringJPASaveAllRepo;

@SpringBootApplication
public class SpringJpaSaveAllApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaSaveAllApplication.class, args);
	}
      
	@Autowired
 	 private SpringJPASaveAllRepo springJPASaveAllRepo;
	
	
	@Override
	public void run(String... args) throws Exception {
		ProductSaveAll product=new ProductSaveAll();
		
		product.setName("shrikanth m");
		product.setAddress("Hubli 1");
		
		
		ProductSaveAll product1=new ProductSaveAll();
		product1.setName("shrikanth m2");
		product1.setAddress("Hubli 2");
		
		springJPASaveAllRepo.saveAll(List.of(product,product1));
		     
		
		//springJPASaveAllRepo.save(product);
		springJPASaveAllRepo.findAll().forEach((p) -> {
            System.out.println(p.getName());
        });
		
		
	}

}
