package dev.pet.todolist.dto.request;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
@Setter
@Getter

@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserUpdateRequest {

    String password;
    String firstName;
    String lastName;
    LocalDate dob;
}
