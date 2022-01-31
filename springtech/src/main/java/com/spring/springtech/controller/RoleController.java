package com.spring.springtech.controller;

import com.spring.springtech.exception.InformationExistException;
import com.spring.springtech.exception.InformationNotFoundException;
import com.spring.springtech.model.Role;
import com.spring.springtech.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class RoleController {

    //creates a new roleRepository object
    private RoleRepository roleRepository;

    //dependency injection
    @Autowired
    public void setRoleRepository(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @GetMapping("/hello-world/")
    public String getHelloWorld() {
        return "Hello World!";
    }

    @GetMapping("/roles/")
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    @PostMapping("/roles/")
    public Role createRole(@RequestBody Role roleObject) {
        Role role = roleRepository.findByName(roleObject.getName());
        if (role != null) {
            throw new InformationExistException("category with name " + role.getName() + " already exists");
        } else {
            return roleRepository.save(roleObject);
        }
    }

    @GetMapping("/roles/{roleId}/")
    public Optional getRole(@PathVariable(value = "roleId") Long roleId) {
        Optional role = roleRepository.findById(roleId);
        if (role.isPresent()) {
            return role;
        } else {
            throw new InformationNotFoundException("role with id " + roleId + " not found");
        }
    }

    @PutMapping("/roles/{roleId}/")
    public Role updateRole(@PathVariable(value = "roleId") Long roleId, @RequestBody Role roleObject) {
        Optional<Role> role = roleRepository.findById(roleId);
        if (role.isPresent()) {
            if (roleObject.getName().equals(role.get().getName())) {
                System.out.println("Same");
                throw new InformationExistException("category " + role.get().getName() + " is already exists");
            } else {
                Role updateRole = roleRepository.findById(roleId).get();
                updateRole.setName(roleObject.getName());
                return roleRepository.save(updateRole);
            }
        } else {
            throw new InformationNotFoundException("category with id " + roleId + " not found");
        }
    }

    @DeleteMapping ("/roles/{roleId}/")
    public Optional<Role> deleteRole(@PathVariable(value = "roleId") Long roleId) {
        Optional<Role> role = roleRepository.findById(roleId);

        if (role.isPresent()) {
            roleRepository.deleteById(roleId);
            return role;
        } else {
            throw new InformationNotFoundException("category with id " + roleId + " not found");
        }
    }
    }

}
