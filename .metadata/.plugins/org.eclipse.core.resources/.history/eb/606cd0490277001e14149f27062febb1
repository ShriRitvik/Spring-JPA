package com.SpringJPA.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringJPA.Entity.Employee;

public interface SpringJPARepo extends JpaRepository<Employee, Long>{
	
	/**
     * Return the distinct product entry whose name is given as a method parameter
     *  If no product entry is found, this method returns null.
     */
	
	Employee findDistinctByName(String name);
}
