package com.SpringJPA.Query.Entity;

import org.springframework.boot.autoconfigure.web.WebProperties.Resources.Chain.Strategy;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "query_product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;

	private String lname;

	private String description;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String name, String description, String lname) {
		super();
		this.name = name;
		this.description = description;
		this.lname = lname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLname() {
		return lname;
	}

	public void setlname(String lname) {
		this.lname = lname;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", "
				+ "description=" 
				+ description + ","
						+ "lname="+ lname +" ]";
	}

}
