package com.SpringJPA;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.SpringJPA.Entity.Employee;
import com.SpringJPA.repo.SpringJPARepo;

@SpringBootApplication
public class MainSpringJpa implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MainSpringJpa.class, args);
	}
      
	@Autowired
 	 private SpringJPARepo springJPARepo;
	
	
	@Override
	public void run(String... args) throws Exception {
	Employee e=new Employee();
	//springJPARepo.delete(e);
	
	springJPARepo.deleteAll();
		
	
		
		
	}

}
