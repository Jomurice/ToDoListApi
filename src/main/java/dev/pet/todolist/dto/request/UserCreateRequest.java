package dev.pet.todolist.dto.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserCreateRequest {
    String username;
    String password;
    String firstName;
    String lastName;
    LocalDate dob;
}
