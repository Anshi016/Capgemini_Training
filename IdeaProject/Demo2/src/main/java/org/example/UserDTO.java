package org.example;

public class UserDTO {

    private int id;
    private String task;
    private String description;

    public UserDTO() {
    }

    public UserDTO (int id, String task , String description) {
        this.id = id;
        this.task = task;
        this.description = description;
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


    public String toString() {
        return "Task{" + "id =" + id + ", task =" + task + '\'' +  ", description " +  description + '\'';
    }
}
