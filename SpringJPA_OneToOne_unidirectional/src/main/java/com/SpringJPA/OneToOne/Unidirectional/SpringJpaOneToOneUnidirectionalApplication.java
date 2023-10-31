package com.SpringJPA.OneToOne.Unidirectional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.logging.LoggingApplicationListener;

import com.SpringJPA.OneToOne.Unidirectional.Entity.Laptop;
import com.SpringJPA.OneToOne.Unidirectional.Entity.Student;
import com.SpringJPA.OneToOne.Unidirectional.Repo.LaptopRepo;
import com.SpringJPA.OneToOne.Unidirectional.Repo.StudentRepo;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class SpringJpaOneToOneUnidirectionalApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaOneToOneUnidirectionalApplication.class, args);
	}

	@Autowired
	 private StudentRepo studentRepo;
	 
	 @Autowired
	 private LaptopRepo laptopRepo;
	 
	@Override
	public void run(String... args) throws Exception {
		
       Student student=new Student();
       student.setId(1);
       student.setName("Shrikanth Malligawad");
       student.setAbout("I Am Software Engineer");
   
       
       Laptop laptop =new Laptop();
       laptop.setId(11);
       laptop.setBrand("HP");
       laptop.setModel("XVZ8");
       
       //Student is parent whenvwer CaseCade using to onetoone need not to save anonter entity
       //We only using parent Enity to save
       
       // save both Student and Laptop ( Cascade type - ALL)
       student.setLaptop(laptop);
      
       Student save=studentRepo.save(student);
       
      
       
       System.out.println("Student" + save.toString());
       
          
       
		
	}

}
