package dev.pet.todolist.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Users")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
    @Id
    String id;
    String username;
    String password;
    String firstName;
    String lastName;
    LocalDate dob;
    @OneToMany(mappedBy = "user")
    List<Task> tasks;
}
