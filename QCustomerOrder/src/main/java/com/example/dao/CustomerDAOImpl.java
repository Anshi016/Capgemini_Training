package com.example.dao;

import com.example.entity.Customer;
import com.example.util.JPAUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import java.util.List;

public class CustomerDAOImpl {

    public void insertCustomer(Customer customer) {

        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        em.persist(customer);
        tx.commit();

        em.close();
    }

    public Customer getCustomerById(int id) {

        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();

        Customer c = em.find(Customer.class, id);

        em.close();
        return c;
    }

    public List<Customer> getAllCustomers() {

        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();

        List<Customer> list =
                em.createQuery("FROM Customer", Customer.class).getResultList();

        em.close();

        return list;
    }

    public void updateCustomer(Customer customer) {

        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        em.merge(customer);
        tx.commit();

        em.close();
    }

    public void deleteCustomer(int id) {

        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();

        Customer c = em.find(Customer.class,id);
        em.remove(c);

        tx.commit();
        em.close();
    }

    // JPQL query
    public Customer getCustomerByEmail(String email){

        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();

        Customer c = em.createQuery(
                "SELECT c FROM Customer c WHERE c.email = :email",
                Customer.class)
                .setParameter("email", email)
                .getSingleResult();

        em.close();
        return c;
    }
}

