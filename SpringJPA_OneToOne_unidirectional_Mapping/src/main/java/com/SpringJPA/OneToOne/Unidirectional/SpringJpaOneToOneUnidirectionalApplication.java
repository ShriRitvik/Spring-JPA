package com.SpringJPA.OneToOne.Unidirectional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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

		Student student = new Student();
		student.setId(2);
		student.setName("shrikantM");
		student.setAbout("I am Software ngineer");
		
		
		
		Laptop laptop=new Laptop();
		laptop.setId(21);
		laptop.setBrand("HP");
		laptop.setModel("Shri08");
		
		
		
		//ONETOONE UNIDIRECTIONAL
		////only used for Foregin KEY
		student.setLaptop(laptop);
		
		Student save=studentRepo.save(student);
		
		System.out.println("Student Laptop Details" + save.toString());

	}

}
