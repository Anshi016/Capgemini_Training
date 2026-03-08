package com.hiber.QCustomerOrder;

import com.example.dao.CustomerDAOImpl;
import com.example.entity.Customer;
import com.example.entity.Order;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {

        CustomerDAOImpl dao = new CustomerDAOImpl();

        // -------- Customer 1 --------
        Order order1 = new Order();
        order1.setOrderNumber("ORD101");
        order1.setProductName("Laptop");
        order1.setQuantity(1);
        order1.setPrice(70000);
        order1.setOrderDate(LocalDate.now());

        Customer customer1 = new Customer();
        customer1.setCustomerName("Rakesh");
        customer1.setEmail("rakesh@mail.com");
        customer1.setGender("Male");
        customer1.setPhone(9876543210L);
        customer1.setRegistrationDate(LocalDate.now());
        customer1.setOrder(order1);

        dao.insertCustomer(customer1);


        // -------- Customer 2  --------
        Order order2 = new Order();
        order2.setOrderNumber("ORD102");
        order2.setProductName("Smartphone");
        order2.setQuantity(2);
        order2.setPrice(30000);
        order2.setOrderDate(LocalDate.now());

        Customer customer2 = new Customer();
        customer2.setCustomerName("Rahul");
        customer2.setEmail("rahul@mail.com");
        customer2.setGender("Male");
        customer2.setPhone(9123456780L);
        customer2.setRegistrationDate(LocalDate.now());
        customer2.setOrder(order2);

        dao.insertCustomer(customer2);


        // -------- Customer 3  --------
        Order order3 = new Order();
        order3.setOrderNumber("ORD103");
        order3.setProductName("Headphones");
        order3.setQuantity(1);
        order3.setPrice(5000);
        order3.setOrderDate(LocalDate.now());

        Customer customer3 = new Customer();
        customer3.setCustomerName("Priya");
        customer3.setEmail("priya@mail.com");
        customer3.setGender("Female");
        customer3.setPhone(9988776655L);
        customer3.setRegistrationDate(LocalDate.now());
        customer3.setOrder(order3);

        dao.insertCustomer(customer3);


        System.out.println("3 Customers with Orders inserted successfully!");
        
        Customer result = dao.getCustomerByEmail("priya@mail.com");

        System.out.println("Customer Found:");
        System.out.println("CustomerId: " + result.getId());
        System.out.println("Name: " + result.getCustomerName());
        System.out.println("Email: " + result.getEmail());
        System.out.println("Gender: " + result.getGender());
        System.out.println("Phone No: " + result.getPhone());
        System.out.println("Registration Date: " + result.getRegistrationDate());
        System.out.println("--------------------------");
    }
}