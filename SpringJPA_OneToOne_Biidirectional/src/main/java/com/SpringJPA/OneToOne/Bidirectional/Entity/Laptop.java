package com.SpringJPA.OneToOne.Bidirectional.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "jpa_laptop")
public class Laptop {
	
	@Id
	private int id;
	
	private String brand;
	
	private String model;
	
	//private Student student;

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Laptop(int id, String brand, String model, Student student) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		//this.student = student;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Laptop [id=" + id + ", brand=" + brand + ", model=" + model + "]";
	}

//	public Student getStudent() {
//		return student;
//	}

//	public void setStudent(Student student) {
//		this.student = student;
//	}

	
	
	

}
