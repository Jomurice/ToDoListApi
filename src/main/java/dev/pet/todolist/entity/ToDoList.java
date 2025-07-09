package dev.pet.todolist.entity;

public class ToDoList {
    private String id;
    private String nameTask;
    private String description;
    private boolean status = false;


    public ToDoList(){}

    public ToDoList(String id, String nameTask, String description, boolean status){
        this.id = id;
        this.nameTask = nameTask;
        this.description =description;
        this.status = status;
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
}
