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

    @Bean
    CommandLineRunner run(UserService userService) {
        return args -> {
            userService.saveRole(new Role(null, "ROLE_USER"));
            userService.saveRole(new Role(null, "ROLE_ADMIN"));

            userService.saveUser(new User(null, "optimusprime456", "prime@gmail.com", "1234", new ArrayList<>()));
            userService.saveUser(new User(null, "benjaminsisko123", "sisko@yahoo.com", "1234", new ArrayList<>()));
            userService.saveUser(new User(null, "christiannodal789", "nodal@gmail.com", "1234", new ArrayList<>()));

            userService.addRoleToUser("optimusprime456", "ROLE_USER");
            userService.addRoleToUser("benjaminsisko123", "ROLE_ADMIN");
            userService.addRoleToUser("christiannodal789", "ROLE_USER");
        };
    }

}
