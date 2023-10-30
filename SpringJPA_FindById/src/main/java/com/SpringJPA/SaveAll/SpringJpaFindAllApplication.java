package com.SpringJPA.SaveAll;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.SpringJPA.SaveAll.Entity.Employee;
import com.SpringJPA.SaveAll.repo.SpringJPAFindAllRepo;

@SpringBootApplication
public class SpringJpaFindAllApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaFindAllApplication.class, args);
	}
      
	@Autowired
 	 private SpringJPAFindAllRepo springJPASaveAllRepo;
	
	
	@Override
	public void run(String... args) throws Exception {
		long count = springJPASaveAllRepo.count();
        System.out.println(count);
		
	
		
		
	}

}
