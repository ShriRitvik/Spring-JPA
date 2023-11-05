package com.SpringJPA.OneToMany.Bidirectional.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringJPA.OneToMany.Bidirectional.Entity.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer> {

}
