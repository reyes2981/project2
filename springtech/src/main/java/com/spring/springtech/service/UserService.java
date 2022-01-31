package com.spring.springtech.service;

import com.spring.springtech.exception.InformationExistException;
import com.spring.springtech.model.Request.LoginRequest;
import com.spring.springtech.model.Response.LoginResponse;
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

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private JwtUtils jwtUtils;


    public User createUser(User userObject){
        if(!userRepository.existsByEmailAddress(userObject.getEmailAddress())){
            //create new user and save it in the database
            userObject.setPassword(passwordEncoder.encode(userObject.getPassword()));
            return userRepository.save(userObject);
        } else{
            throw new InformationExistException("user with email address " + userObject.getEmailAddress() + " already exists");
        }
    }

    public User findUserByEmailAddress(String email){
        return userRepository.findUserByEmailAddress(email);
    }

    public ResponseEntity<?> loginUser(LoginRequest loginRequest){

        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginRequest.getEmail(), loginRequest.getPassword()));

        final UserDetails userDetails = userDetailsService.loadUserByUsername(loginRequest.getEmail());

        final String JWT = jwtUtils.generateToken(userDetails);

        return ResponseEntity.ok(new LoginResponse(JWT));
    }


}
