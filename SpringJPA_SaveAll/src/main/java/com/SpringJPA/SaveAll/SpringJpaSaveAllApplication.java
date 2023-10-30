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
		ProductSaveAll prosaveall=new ProductSaveAll();
		
		prosaveall.setName("product 4");
		prosaveall.setDescription("its good");
		prosaveall.setPrice(new BigDecimal(2100));
		prosaveall.setSku("product 4 sku");
		prosaveall.setActive(true);
		prosaveall.setImageUrl("product4.png");
		
		ProductSaveAll prosaveall1=new ProductSaveAll();
		prosaveall1.setName("product 5");
		prosaveall1.setDescription("its good");
		prosaveall1.setPrice(new BigDecimal(5100));
		prosaveall1.setSku("product 5 sku");
		prosaveall1.setActive(true);
		prosaveall1.setImageUrl("product4.png");
		
		springJPASaveAllRepo.saveAll(List.of(prosaveall, prosaveall1));
		
		
		
	}

}
