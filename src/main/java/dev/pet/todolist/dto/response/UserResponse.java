package dev.pet.todolist.dto.response;

import dev.pet.todolist.entity.Task;
import jakarta.persistence.OneToMany;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserResponse{
    String id;
    String username;
    String password;
    String firstName;
    String lastName;
    LocalDate dob;
    @OneToMany(mappedBy = "user")
    List<Task> tasks;
}
