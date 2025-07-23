package dev.pet.todolist.controller;

import dev.pet.todolist.dto.request.UserCreateRequest;
import dev.pet.todolist.dto.request.UserUpdateRequest;
import dev.pet.todolist.dto.response.UserResponse;
import dev.pet.todolist.entity.User;
import dev.pet.todolist.service.impl.UserServiceImpl;
import jakarta.persistence.PreUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @GetMapping()
    public List<User> GetAllUsers(){
        return userService.findAllUsers();
    }

    @GetMapping("/{userId}")
    public UserResponse getUserById(@PathVariable String userId){
        return userService.findByUserId(userId);
    }
    @PostMapping()
    public User createUser(@RequestBody UserCreateRequest request){
        return userService.createUser(request);
    }
    @PutMapping("/{userId}")
    public User updateUser(@RequestBody UserUpdateRequest request, @PathVariable String userId){
        return userService.updateUser(request, userId);
    }
    @DeleteMapping("/{userId}")
    public void deleteUserId(@PathVariable String userId){
        userService.deleteUserById(userId);
    }

}
