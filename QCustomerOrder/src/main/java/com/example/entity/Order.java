package com.example.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String orderNumber;
    private String productName;
    private int quantity;
    private double price;
    private LocalDate orderDate;

    @OneToOne(mappedBy="order")
    private Customer customer;

    //Constructors
    public Order(){
    	
    }

	public Order(int id, String orderNumber, String productName, int quantity, double price, LocalDate orderDate,
			Customer customer) {
		super();
		this.id = id;
		this.orderNumber = orderNumber;
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
		this.orderDate = orderDate;
		this.customer = customer;
	}

	//Getters and setters
	public int getId() {
		return id;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public String getProductName() {
		return productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getPrice() {
		return price;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}
