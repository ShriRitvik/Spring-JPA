package com.SpringJPA.OneToOne.Unidirectional.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringJPA.OneToOne.Unidirectional.Entity.Laptop;

public interface LaptopRepo extends JpaRepository<Laptop, Integer> {

}
