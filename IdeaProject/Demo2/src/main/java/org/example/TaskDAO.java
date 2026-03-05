package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.ArrayList;
import java.util.List;

public class TaskDAO {

    private EntityManagerFactory emf;
    private EntityManager em;

    public TaskDAO() {
        // Get EntityManagerFactory from persisence.xml ( persistence unit name :
        this.emf = Persistence.createEntityManagerFactory("taskPU");
        this.em = emf.createEntityManager();
    }

    //CREATE - Save a new Task to database
    public TaskDTO create(Task task) {
        try {
            // Step 1: Begin transaction
            em.getTransaction().begin();

            // Step 2: Persist (save) the Task entity
            em.persist(task);


            //Step 3: Commit transaction (write to database)

            em.getTransaction().commit();

            System.out.println("Task created successfully with id:" +  task.getId());

             return convertToDTO(task);

        } catch(Exception e ) {

            // Rollback if error occur
            if( em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            System.out.println("x Error creating task: " + e.getMessage());
            return null;
        }
    }

    // READ - Get a task by id

    public TaskDTO read(Long id) {
        // No transaction needed for read operation
        try {
            Task task = em.find(Task.class, id);

            if (task != null) {
                System.out.println("Task fund with id: " + id);
                return convertToDTO(task);
            } else {
                System.out.println("Task nit found with id: " + id);
                return null;
            }
        } catch(Exception e) {
            System.out.println("Error reading task: " + e.getMessage());
            return null;
        }
    }

    public TaskDTO update(Long id , String taskName , String description) {
        try {
            // step 1: Begin transaction
            em.getTransaction().begin();

            // Step 2: Find the task

            Task task = em.find(Task.class , id);

            if( task != null) {
                // Step 3: Update fields
                task.setTask(taskName);
                task.setDescription(description);

                // Step 4 : Merge ( update in database
                Task updateTask = em.merge(task);

                // step 5 : Commit transaction
                em.getTransaction().commit();

                System.out.println("Task updates successfully with id : " + id);
                return convertToDTO(updateTask);
            } else {
                em.getTransaction().rollback();
                System.out.println("Task not found with id : " + id);
                return null;
            }
        } catch ( Exception e) {
            if(em.getTransaction().isActive()){
                em.getTransaction().rollback();
            }
            System.out.println("Error updating task:" + e.getMessage());
            return null;
        }
    }

    public boolean delete (Long id) {
        try {
            // Step 1: Begin transaction
            em.getTransaction().begin();

            // Step 2: Find the task
            Task task = em.find(Task.class, id);

            if(task != null) {
                // Step 3: Remove (delete) from database
                em.remove(task);

                // Step 4: Commit transaction
                em.getTransaction().commit();

                System.out.println("Task deleted successfully with id" + id);
                return true;
            } else {
                em.getTransaction().rollback();
                System.out.println("Task not found with id: " + id);
                return false;
            }
        } catch ( Exception e) {
            if(em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            System.out.println("Error deleting task:" + e.getMessage());
            return false;
        }
    }

    public List<TaskDTO> getAllTask() {
        List<TaskDTO> taskList = new ArrayList<>();

        try {

            // JPQL Query to get all tasks

            String jpql = "SELECT t FROM Task t";
            List<Task> tasks = em.createQuery(jpql , Task.class).getResultList();

            // Convert each Entity to DTO

            for( Task task : tasks) {
                taskList.add(convertToDTO(task));
            }

            System.out.println("Retrieved " + taskList.size() + " tasks from database");
            return taskList;
        } catch ( Exception e) {
            System.out.println("Error retrieving tasks: " + e.getMessage());
            return taskList; // return empty list if error
        }
    }
    // Close EntityManager ( cleanup )
    public void close() {
        if( em != null && em.isOpen()) {
            em.close();
        }
        if( emf != null && emf.isOpen()) {
            emf.close();
        }

        System.out.println("Database connection closed");
    }

    // Helper method - convert Entity to DTO

    private TaskDTO convertToDTO(Task task) {
        return new TaskDTO(
                task.getId(),
                task.getTask(),
                task.getDescription()
        );
    }




}
