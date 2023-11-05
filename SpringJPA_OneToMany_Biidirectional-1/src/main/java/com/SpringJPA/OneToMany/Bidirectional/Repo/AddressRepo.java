package com.SpringJPA.OneToMany.Bidirectional.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringJPA.OneToMany.Bidirectional.Entity.Address;

public interface AddressRepo extends JpaRepository<Address, Integer>{

}
