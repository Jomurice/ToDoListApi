package dev.pet.todolist.service;

import dev.pet.todolist.dto.request.CreateTaskRequest;
import dev.pet.todolist.entity.Task;
import dev.pet.todolist.repository.ToDoListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoListService {
    @Autowired
    private ToDoListRepository toDoListRepo;


    public List<Task> getAllToDoList(){
        return toDoListRepo.findAll();
    }

    public Task getToDoList(String id){
        return toDoListRepo.findById(id).orElseThrow(() -> new RuntimeException("TodoList not find"));
    }

    public Task createTask(CreateTaskRequest request){
        Task toDolist = new Task();

        toDolist.setNameTask(request.getNameTask());
        toDolist.setDescription(request.getDescription());

        return toDoListRepo.save(toDolist);
    }



}
