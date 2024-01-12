package com.thorabh.springjpademonpci;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Integer price;
	
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "product")
	private List<Customer_Product> customer_Products = new ArrayList<>();;

	public Product() {
		super();
	}

	public Product(String name, Integer price) {
		super();
		this.name = name;
		this.price = price;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public List<Customer_Product> getCustomer_Products() {
		return customer_Products;
	}

	public void setCustomer_Products(List<Customer_Product> customer_Products) {
		this.customer_Products = customer_Products;
	}

	
	
	
}
