package dev.pet.todolist.controller;

import dev.pet.todolist.dto.request.TaskCreateRequest;
import dev.pet.todolist.dto.request.TaskUpdateRequest;
import dev.pet.todolist.entity.Task;
import dev.pet.todolist.service.impl.TaskServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin()
@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    TaskServiceImpl taskService;

    @GetMapping()
    public List<Task> getAllUsers(){
        return taskService.findAllTasks();
    }

    @GetMapping("/{taskId}")
    public Task getUserById(@PathVariable Long taskId){
        return taskService.findTaskById(taskId);
    }

    @PostMapping
    public Task createTask(@RequestBody TaskCreateRequest request){
        return taskService.createTask(request);
    }

    @PutMapping("/{taskId}")
    public Task updateTask(@RequestBody TaskUpdateRequest request, @PathVariable Long taskId){
        return taskService.updateTask(request, taskId);
    }

    @DeleteMapping("/{taskId}")
    public void deleteTaskById(@PathVariable  Long taskId){
        taskService.deleteTaskById(taskId);
    }
}
