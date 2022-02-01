package com.spring.springtech;

import com.spring.springtech.model.Role;
import com.spring.springtech.model.User;
import com.spring.springtech.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class SpringtechApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringtechApplication.class, args);
    }

    @Bean
    BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

//    @Bean
//    CommandLineRunner run(UserService userService) {
//        return args -> {
//            userService.saveRole(new Role(null, "ROLE_USER"));
//            userService.saveRole(new Role(null, "ROLE_ADMIN"));
//
//            userService.saveUser(new User(null, "optimus prime", "prime@gmail.com", "1234", new ArrayList<>()));
//            userService.saveUser(new User(null, "benjamin sisko", "sisko@yahoo.com", "1234", new ArrayList<>()));
//            userService.saveUser(new User(null, "christian nodal", "nodal@gmail.com", "1234", new ArrayList<>()));
//
//            userService.addRoleToUser("prime@gmail.com", "ROLE_USER");
//            userService.addRoleToUser("sisko@yahoo.com", "ROLE_ADMIN");
//            userService.addRoleToUser("nodal@gmail.com", "ROLE_USER");
//        };
//    }

}
