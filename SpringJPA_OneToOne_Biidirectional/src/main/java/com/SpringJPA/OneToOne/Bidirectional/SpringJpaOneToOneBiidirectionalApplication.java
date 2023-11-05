package com.SpringJPA.OneToOne.Bidirectional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.SpringJPA.OneToOne.Bidirectional.Entity.Laptop;
import com.SpringJPA.OneToOne.Bidirectional.Entity.Student;
import com.SpringJPA.OneToOne.Bidirectional.Repo.LaptopRepo;
import com.SpringJPA.OneToOne.Bidirectional.Repo.StudentRepo;

@SpringBootApplication
public class SpringJpaOneToOneBiidirectionalApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaOneToOneBiidirectionalApplication.class, args);
	}

	   
	  @Autowired
	  private StudentRepo studentRepo;
	  
	  @Autowired
	  private LaptopRepo laptopRepo;
	  
	  
	@Override
	public void run(String... args) throws Exception {
		 
		Student student=new Student();
		student.setId(111);
		student.setAbout("SOftware Engineer");
		student.setName("Shrikanth M");
		
		
		Laptop laptop=new Laptop();
		laptop.setId(1111);
		laptop.setBrand("Dell");
		laptop.setModel("MM019");
		
		//Birectional 
		student.setLaptop(laptop);
		laptop.setStudent(student);
		
		
		//Birectional 
		Student sa1=studentRepo.save(student);
		Laptop lap=laptopRepo.save(laptop);
		
		System.out.println("student Details" + sa1.toString());
	      

		
	}

}
