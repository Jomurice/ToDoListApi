package dev.pet.todolist.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
public class TaskUpdateRequest {
    private String nameTask;
    private String description;
    private boolean status ;
}
