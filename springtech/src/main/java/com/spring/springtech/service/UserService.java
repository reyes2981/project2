package com.spring.springtech.service;

import com.spring.springtech.exception.InformationExistException;
import com.spring.springtech.model.Request.LoginRequest;
import com.spring.springtech.model.Response.LoginResponse;
import com.spring.springtech.model.Role;
import com.spring.springtech.model.User;
import com.spring.springtech.repository.UserRepository;
import com.spring.springtech.security.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String emailAddress, String roleName);
    User getUser(String username);
    List<User> getUsers();



}
