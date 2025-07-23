package dev.pet.todolist.dto.request;

import lombok.*;
import lombok.experimental.FieldDefaults;


@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TaskUpdateRequest {
     String nameTask;
     String description;
     boolean status ;
}
