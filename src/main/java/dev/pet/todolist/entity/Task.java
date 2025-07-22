package dev.pet.todolist.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity

public class Task {
    private String id;
    private String nameTask;
    private String description;
    private boolean status = false;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Task() {

    }

    public Task(String id, String nameTask, String description, boolean status, User user) {
        this.id = id;
        this.nameTask = nameTask;
        this.description = description;
        this.status = status;
        this.user = user;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameTask() {
        return nameTask;
    }

    public void setNameTask(String nameTask) {
        this.nameTask = nameTask;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
