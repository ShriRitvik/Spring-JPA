package com.SpringJPA.SaveAll.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringJPA.SaveAll.Entity.Employee;

public interface SpringJPAFindAllRepo extends JpaRepository<Employee, Long>{

}
