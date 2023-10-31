package com.SpringJPA.OneToOne.Unidirectional.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="jpa_map_student")
public class Student {
    
	
	@Id
	private int id;

	private String name;

	private String about;
	
	
	// Unidirectional
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="fk_laptop_id")
	private Laptop laptop;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, String about, Laptop laptop) {
		super();
		this.id = id;
		this.name = name;
		this.about = about;
		this.laptop = laptop;
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

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ","
				+ " name=" + name + ","
						+ " about=" + about + ", "
								+ "laptop=" + laptop + "]";
	}
	
	
	

}
