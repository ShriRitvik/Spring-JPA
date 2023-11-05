package com.SpringJPA.OneToOne.Bidirectional.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringJPA.OneToOne.Bidirectional.Entity.Laptop;

public interface LaptopRepo  extends JpaRepository<Laptop, Integer>{

}
