package com.spring.springtech.service;

import com.spring.springtech.model.Role;
import com.spring.springtech.model.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {

    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String emailAddress, String roleName);
    User getUser(String emailAddress);
    List<User> getUsers();



}
