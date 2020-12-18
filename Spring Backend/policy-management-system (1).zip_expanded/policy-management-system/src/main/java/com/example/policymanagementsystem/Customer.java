package com.example.policymanagementsystem;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")

public class Customer {

	@Id
	@Column(name="customer_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId	;
	private String name;
	private LocalDate dob ;
	
	public Customer(int customerId, String name, LocalDate dob) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.dob = dob;	
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	
}
