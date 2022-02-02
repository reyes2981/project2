package com.spring.springtech.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class UserController {

    @GetMapping(path = "/users/")
    public String getCategories() {
        return "get all users";
    }

    @GetMapping(path = "/users/{userId}")
    public String getUser(@PathVariable Long userId) {
        return "getting the user with the id of " + userId;
    }

    @PostMapping("/users/")
    public String createUser(@RequestBody String body) {
        return "creating a user " + body;
    }

    @PutMapping("/users/{userId}")
    public String updateUser(@PathVariable(value = "userId") Long userId, @RequestBody String body) {
        return "updating the user with the id of " + userId + body;
    }

    @DeleteMapping("/users/{userId}")
    public String deleteUser(@PathVariable(value = "userId") Long userId) {
        return "deleting the user with the id of " + userId;
    }
}