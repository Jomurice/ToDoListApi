package dev.pet.todolist.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Users")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String id;
    String username;
    String password;
    String firstName;
    String lastName;
    LocalDate dob;
    @OneToMany(mappedBy = "user")
    List<Task> tasks;

    public User() {
    }

    public User(LocalDate dob, String firstName, String id, String lastName, String password, List<Task> tasks, String username) {
        this.dob = dob;
        this.firstName = firstName;
        this.id = id;
        this.lastName = lastName;
        this.password = password;
        this.tasks = tasks;
        this.username = username;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
