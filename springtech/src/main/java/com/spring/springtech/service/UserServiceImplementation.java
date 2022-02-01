package com.spring.springtech.service;

import com.spring.springtech.model.Role;
import com.spring.springtech.model.User;
import com.spring.springtech.repository.RoleRepository;
import com.spring.springtech.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service @RequiredArgsConstructor @Transactional @Slf4j
public class UserServiceImplementation implements UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public Role saveRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public void addRoleToUser(String emailAddress, String roleName) {
        User user = userRepository.findUserByEmailAddress(emailAddress);
        Role role = roleRepository.findByName(roleName);
        user.getRoles().add(role);
    }

    @Override
    public User getUser(String username) {
        return null;
    }

    @Override
    public List<User> getUsers() {
        return null;
    }
}
