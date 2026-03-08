package com.example.util;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtil {

    private static EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("CustomerOrderPU");

    public static EntityManagerFactory getEntityManagerFactory() {
        return emf;
    }
}
