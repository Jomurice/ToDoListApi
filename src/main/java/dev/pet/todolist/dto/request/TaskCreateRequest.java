package dev.pet.todolist.dto.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TaskCreateRequest {
    String nameTask;
    String description;
    boolean status = false;


}
