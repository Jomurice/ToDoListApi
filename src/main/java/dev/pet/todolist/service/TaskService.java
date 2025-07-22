package dev.pet.todolist.service;

import dev.pet.todolist.dto.request.TaskCreateRequest;
import dev.pet.todolist.dto.request.TaskUpdateRequest;
import dev.pet.todolist.entity.Task;

import java.util.List;

public interface TaskService {
    List<Task> findAllTasks();
    Task findTaskById(Long taskId);
    Task createTask (TaskCreateRequest request);
    Task updateTask(TaskUpdateRequest request, Long taskId);
    void deleteTaskById(Long taskId);

}
