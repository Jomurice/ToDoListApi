package dev.pet.todolist.dto.request;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class TaskCreateRequest {
    private String nameTask;
    private String description;
    private boolean status = false;


}
