package dev.pet.todolist.service;

//import dev.pet.todolist.entity.User;
//import dev.pet.todolist.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Service
//public class CustomUserDetailManagerService implements UserDetailsService {
//
//    @Autowired
//    UserRepository userRepo;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = userRepo.findByUsername(username);
//
//         if(user == null){
//             throw new UsernameNotFoundException("user not found");
//         }
//        String password = user.getPassword();
//        String[] role = user.getUserRoles().stream()
//                .map(ur->ur.getRole().getId().substring(5)).toList().toArray(String[]::new);
//        return org.springframework.security.core.userdetails.User
//                .withUsername(username)
//                .password(password)
//                .roles(role)
//                .build();
//
//    }
//}
