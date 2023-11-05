package com.SpringJPA.OneToMany.Bidirectional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.SpringJPA.OneToMany.Bidirectional.Entity.Address;
import com.SpringJPA.OneToMany.Bidirectional.Entity.Employee;
import com.SpringJPA.OneToMany.Bidirectional.Repo.AddressRepo;
import com.SpringJPA.OneToMany.Bidirectional.Repo.EmpRepo;

@SpringBootApplication
public class SpringJpaOneToManyBiidirectional1Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaOneToManyBiidirectional1Application.class, args);
	}

	@Autowired
	 private EmpRepo empRepo;
	 
	 @Autowired
	 private AddressRepo arepo;
	 
	@Override
	public void run(String... args) throws Exception {
		
		Employee e=new Employee();
		e.setName("shrikant");
		
		Address a=new Address();
		a.setCity("Hubli");
		a.setPhone(965343);
		
		empRepo.save(e);
		
	}

}
