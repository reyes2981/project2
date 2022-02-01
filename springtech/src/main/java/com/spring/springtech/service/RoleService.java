package com.spring.springtech.service;
import com.spring.springtech.exception.InformationExistException;
import com.spring.springtech.exception.InformationNotFoundException;
import com.spring.springtech.model.Role;
import com.spring.springtech.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

//business logic
//public class RoleService {
//    private RoleRepository roleRepository;
//
//    @Autowired
//    public void setRoleRepository(RoleRepository roleRepository) {
//        this.roleRepository = roleRepository;
//    }
//
//    public List<Role> getRoles() {
//        System.out.println("service calling getRoles ==>");
//        return roleRepository.findAll();
//    }
//
//    public Optional getRole(Long roleId) {
//        System.out.println("service getRole ==>");
//        Optional role = roleRepository.findById(roleId);
//        if (role.isPresent()) {
//            return role;
//        } else {
//            throw new InformationNotFoundException("role with id " + roleId + " not found");
//        }
//    }
//
//    public Role createRole(Role roleObject) {
//        System.out.println("service calling createRole ==>");
//
//        Role role = roleRepository.findByName(roleObject.getName());
//        if (role != null) {
//            throw new InformationExistException("role with name " + role.getName() + " already exists");
//        } else {
//            return roleRepository.save(roleObject);
//        }
//    }
//
//    public Role updateRole(Long roleId, Role roleObject) {
//        System.out.println("service calling updateRole ==>");
//        Optional<Role> role = roleRepository.findById(roleId);
//        if (role.isPresent()) {
//            if (roleObject.getName().equals(role.get().getName())) {
//                System.out.println("Same");
//                throw new InformationExistException("role " + role.get().getName() + " is already exists");
//            } else {
//                Role updateRole = roleRepository.findById(roleId).get();
//                updateRole.setName(roleObject.getName());
//                return roleRepository.save(updateRole);
//            }
//        } else {
//            throw new InformationNotFoundException("role with id " + roleId + " not found");
//        }
//    }
//
//    public Optional<Role> deleteRole(Long roleId) {
//        System.out.println("service calling deleteRole ==>");
//        Optional<Role> role = roleRepository.findById(roleId);
//
//        if (((Optional<?>) role).isPresent()) {
//            roleRepository.deleteById(roleId);
//            return role;
//        } else {
//            throw new InformationNotFoundException("role with id " + roleId + " not found");
//        }
//    }
//
//}
