package com.example.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String customerName;
    private String email;
    private String gender;
    private long phone;
    private LocalDate registrationDate;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="order_id")
    private Order order;

    
    //Constructors
    public Customer(){
    	
    }
    
	public Customer(int id, String customerName, String email, String gender, long phone, LocalDate registrationDate,
			Order order) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.email = email;
		this.gender = gender;
		this.phone = phone;
		this.registrationDate = registrationDate;
		this.order = order;
	}

	
    //Getters and setters
	public int getId() {
		return id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getEmail() {
		return email;
	}

	public String getGender() {
		return gender;
	}

	public long getPhone() {
		return phone;
	}

	public LocalDate getRegistrationDate() {
		return registrationDate;
	}

	public Order getOrder() {
		return order;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
}
