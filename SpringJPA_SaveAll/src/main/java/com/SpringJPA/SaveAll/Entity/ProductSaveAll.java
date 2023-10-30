package com.SpringJPA.SaveAll.Entity;

import java.math.BigDecimal;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ProductSaveAll")
public class ProductSaveAll {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long id;

	private String sku;

	private String name;

	private String description;

	private BigDecimal price;

	private boolean active;
    
  @CreationTimestamp
	private Date dateCreated;

  @UpdateTimestamp
	private Date lastUpdated;

	private String imageUrl;

	public ProductSaveAll() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductSaveAll(String sku, String name, String description, BigDecimal price, boolean active,
			Date dateCreated, Date lastUpdated, String imageUrl) {
		super();
		this.sku = sku;
		this.name = name;
		this.description = description;
		this.price = price;
		this.active = active;
		this.dateCreated = dateCreated;
		this.lastUpdated = lastUpdated;
		this.imageUrl = imageUrl;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
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

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	@Override
	public String toString() {
		return "ProductSaveAll [id=" + id + ", sku=" + sku + ", name=" + name + ", description=" + description
				+ ", price=" + price + ", active=" + active + ", dateCreated=" + dateCreated + ", lastUpdated="
				+ lastUpdated + ", imageUrl=" + imageUrl + "]";
	}
	
	

}
