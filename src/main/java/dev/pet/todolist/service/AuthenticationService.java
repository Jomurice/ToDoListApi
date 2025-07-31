package dev.pet.todolist.service;

import dev.pet.todolist.dto.request.AuthenticationRequest;
import dev.pet.todolist.entity.User;
import dev.pet.todolist.repository.UserRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class AuthenticationService {

    UserRepository userRepository;

    public boolean authenticate(AuthenticationRequest request){
        User user = userRepository.findByUsername(request.getUsername())
                .orElseThrow(() -> new RuntimeException("user not found"));
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder(10);
        return  passwordEncoder.matches(request.getPassword(), user.getPassword());
    }
}
