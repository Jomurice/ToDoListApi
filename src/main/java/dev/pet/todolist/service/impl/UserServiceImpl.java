package dev.pet.todolist.service.impl;

import dev.pet.todolist.dto.request.UserCreateRequest;
import dev.pet.todolist.dto.request.UserUpdateRequest;
import dev.pet.todolist.entity.User;
import dev.pet.todolist.repository.UserRepository;
import dev.pet.todolist.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User findByUserId(@PathVariable String userId) {
        return userRepository.findById(userId).orElseThrow(
                () -> new RuntimeException("user not found")
        );
    }

    @Override
    public User createUser(UserCreateRequest request) {
        User user = new User();

        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setDob(request.getDob());

        return userRepository.save(user);
    }

    @Override
    public User updateUser(UserUpdateRequest request, @PathVariable String userId) {
        User user = findByUserId(userId);

        user.setPassword(request.getPassword());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setDob(request.getDob());

        return userRepository.save(user);
    }

    @Override
    public void deleteUserById(@PathVariable String userId) {
        userRepository.deleteById(userId);
    }
}
