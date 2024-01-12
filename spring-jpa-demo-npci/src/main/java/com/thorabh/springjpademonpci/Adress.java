package com.thorabh.springjpademonpci;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="adresses")
public class Adress {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="room_no",nullable = false)
	private Integer roomNo;
	
	@Column(name="apt",nullable = false)
	private String apt;
	
	@Column(name="street",nullable = false)
	private String street;
	
	@Column(name="city",nullable = false)
	private String city;
	
	@Column(name="pincode",nullable = false)
	private Integer pincode;
	
	@ManyToOne
//	@JoinColumn(name = "customer_id")
	private Customer customer;
	
	

	public Adress() {
		super();
	}



	public Adress(Integer roomNo, String apt, String street, String city, Integer pincode) {
		super();
		this.roomNo = roomNo;
		this.apt = apt;
		this.street = street;
		this.city = city;
		this.pincode = pincode;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Integer getRoomNo() {
		return roomNo;
	}



	public void setRoomNo(Integer roomNo) {
		this.roomNo = roomNo;
	}



	public String getApt() {
		return apt;
	}



	public void setApt(String apt) {
		this.apt = apt;
	}



	public String getStreet() {
		return street;
	}



	public void setStreet(String street) {
		this.street = street;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public Integer getPincode() {
		return pincode;
	}



	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}



	public Customer getCustomer() {
		return customer;
	}



	public void setCustomer(Customer customer) {
		this.customer = customer;
	}



	@Override
	public String toString() {
		return "Adress [id=" + id + ", roomNo=" + roomNo + ", apt=" + apt + ", street=" + street + ", city=" + city
				+ ", pincode=" + pincode + ", customer=" + customer + "]";
	}
	
	
	
	
	
	
	

}
