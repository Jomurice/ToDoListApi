package dev.pet.todolist.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//
//public class SecurityConfig {
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http.csrf(csrf -> csrf.disable());
//        http.cors(config -> config.disable());
//        http.authorizeHttpRequests(config -> {
//            config.requestMatchers("/api/users").authenticated();
//            config.anyRequest().permitAll();
//        });
//
//        http.formLogin(form->{
//
//        });
//        return http.build();
//    }

//}
