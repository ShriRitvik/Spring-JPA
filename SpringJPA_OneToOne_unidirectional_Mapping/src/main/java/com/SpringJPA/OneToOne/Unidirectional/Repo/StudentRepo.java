package com.SpringJPA.OneToOne.Unidirectional.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringJPA.OneToOne.Unidirectional.Entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{
	
	

}
