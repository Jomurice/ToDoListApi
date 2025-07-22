package dev.pet.todolist.repository;

import dev.pet.todolist.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
