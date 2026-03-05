package org.example;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        System.out.println("Starting JPA....");
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("taskPU");
//        System.out.println("EntityManagerFactory created successfully!");
//        emf.close();
//        System.out.println("Closed successfully!");


        TaskDAO taskDAO = new TaskDAO();
        Task task1= new Task();
        task1.setTask( "Learn Hibernate");
        task1.setDescription ( "Complete Hibernate tutorial from base");
        taskDAO.create(task1);

        Task task2= new Task();
        task2.setTask("Build REST API");
        task2.setDescription ("Create REST API with Spring Boot");
        taskDAO.create(task2);

        Task task3= new Task();
        task3.setTask("Database Optimization");
        task3.setDescription ("Optimize database queries and index");
        taskDAO.create(task3);

        System.out.println("\n --- READ: Getting a single task by id --");
        TaskDTO readTask = taskDAO.read(1L);

        if( readTask != null) {
            System.out.println("Retrieved task: " + readTask);
        }

        System.out.println("\n--- LIST: Getting all tasks ---");
        List<TaskDTO> allTasks = taskDAO.getAllTask();
        System.out.println("All tasks in database:");



    }
}