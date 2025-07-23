package dev.pet.todolist.service.impl;

import dev.pet.todolist.dto.request.TaskCreateRequest;
import dev.pet.todolist.dto.request.TaskUpdateRequest;
import dev.pet.todolist.entity.Task;
import dev.pet.todolist.repository.TaskRepository;
import dev.pet.todolist.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    private TaskRepository taskRepo;

    @Override
    public List<Task> findAllTasks() {
        return taskRepo.findAll();
    }

    @Override
    public Task findTaskById(Long taskId) {
        return taskRepo.findById(taskId).orElseThrow(
                () -> new RuntimeException("Task not found")
        );
    }
    @Override
    public Task createTask(TaskCreateRequest request){

        Task task = new Task();
        task.setNameTask(request.getNameTask());
        task.setDescription(request.getDescription());

        return taskRepo.save(task);
    }

    @Override
    public Task updateTask(TaskUpdateRequest request, Long taskId) {
        Task task = findTaskById(taskId);

        task.setNameTask(request.getNameTask());
        task.setDescription(request.getDescription());
        task.setStatus(request.isStatus());

        return taskRepo.save(task);
    }

    @Override
    public void deleteTaskById(Long taskId) {
        taskRepo.deleteById(taskId);
    }

    @Override
    public List<Task> findByUserId(String userId) {
        return taskRepo.findByUserId(userId);
    }



}
