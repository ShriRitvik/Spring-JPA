package com.SpringJPA.OneToMany.Bidirectional.Entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


//whenver crating one to many ,need not create refrnce class with gettr n setter method
@Entity
@Table(name="bi_emp")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
   @OneToMany(cascade = CascadeType.ALL)
   @JoinColumn(name="fk_id")
	List<Address> adr=new ArrayList<>();


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(String name) {
		super();
		this.name = name;
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}





	
	
	
	

}
