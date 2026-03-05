package org.example;

public class TaskDTO {

    private int id;
    private String task;
    private String description;
    private int user_id;

    public TaskDTO() {
    }

    public TaskDTO (int id, String task , String description , int user_id) {
        this.id = id;
        this.task = task;
        this.description = description;
        this.user_id = user_id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setTask(String task) {
        this.task = task;
    }
    public String getTask() {
        return task;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getUser_id() {
        return user_id;
    }


    public String toString() {
        return "Task{" + "id =" + id + ", task =" + task + '\'' +  ", description " +  description + '\'' + ", user id" + user_id+ '\'';
    }
}

