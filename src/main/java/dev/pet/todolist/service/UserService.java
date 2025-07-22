package dev.pet.todolist.service;

import dev.pet.todolist.dto.request.UserCreateRequest;
import dev.pet.todolist.dto.request.UserUpdateRequest;
import dev.pet.todolist.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAllUsers();
    User findByUserId(String userId);
    User createUser(UserCreateRequest request);
    User updateUser(UserUpdateRequest request, String userId);
    void deleteUserById(String userId);
}
