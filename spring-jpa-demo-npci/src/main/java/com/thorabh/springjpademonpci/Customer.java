package com.thorabh.springjpademonpci;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;

@Entity
@Table(name = "customers")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name",nullable = false)
	private String name;
	
	@Column(name="email",nullable = false,unique = true)
	private String email;
	
	@Column(name="city")
	private String city;
	
	@Column(name="age")
	private Integer age;
	
	
	@OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
	private List<Adress> adresses = new ArrayList<>();
	
	
	@OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
	private List<Customer_Product> customer_Products = new ArrayList<>();
	

	public Customer() {
		super();
	}


	public List<Adress> getAdresses() {
		return adresses;
	}




	public void setAdresses(List<Adress> adresses) {
		this.adresses = adresses;
	}


	public List<Customer_Product> getCustomer_Products() {
		return customer_Products;
	}


	public void setCustomer_Products(List<Customer_Product> customer_Products) {
		this.customer_Products = customer_Products;
	}


	public Customer(String name, String email, String city, Integer age) {
		super();
		this.name = name;
		this.email = email;
		this.city = city;
		this.age = age;
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




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getCity() {
		return city;
	}




	public void setCity(String city) {
		this.city = city;
	}




	public Integer getAge() {
		return age;
	}




	public void setAge(Integer age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", city=" + city + ", age=" + age
				+ ", adresses=" + adresses + ", products=" + customer_Products + "]";
	}




	
	
	
	
	
	
	
	
	
	

}
