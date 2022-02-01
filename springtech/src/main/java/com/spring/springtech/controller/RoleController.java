package com.spring.springtech.controller;

import com.spring.springtech.exception.InformationExistException;
import com.spring.springtech.exception.InformationNotFoundException;
import com.spring.springtech.model.Role;
import com.spring.springtech.model.Submission;
import com.spring.springtech.repository.CategoryRepository;
import com.spring.springtech.repository.RoleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

//@RestController
//@RequestMapping("/api")
//public class RoleController {
//
//    private CategoryRepository categoryRepository;
//    private RoleService roleService;
//
//    @Autowired
//    public void setRoleService(RoleService roleService) {
//        this.roleService = roleService;
//    }
//
//    @Autowired
//    public void setUserRepository(CategoryRepository categoryRepository) {
//        this.categoryRepository = categoryRepository;
//    }
//
//    @GetMapping("/roles")
//    public List<Role> getRoles() {
//        System.out.println("calling getRoles ==>");
//        return roleService.getRoles();
//    }
//
//    @GetMapping(path = "/roles/{rolesId}")
//    public Optional getRole(@PathVariable Long roleId) {
//        System.out.println("calling getRoles ==>");
//        return roleService.getRole(roleId);
//    }
//
//    @PostMapping("/roles/")
//    public Role createRole(@RequestBody Role roleObject) {
//        System.out.println("calling createRole ==>");
//        return roleService.createRole(roleObject);
//    }
//
//    @PutMapping("/roles/{roleId}")
//    public Role updateRole(@PathVariable(value = "roleId") Long roleId, @RequestBody Role roleObject) {
//        System.out.println("calling updateCategory ==>");
//        return roleService.updateRole(roleId, roleObject);
//    }
//
//    @DeleteMapping("/roles/{roleId}")
//    public Optional<Role> deleteRole(@PathVariable(value = "roleId") Long roleId) {
//        System.out.println("calling deleteRole ==>");
//        return roleService.deleteRole(roleId);
//    }
//
//    @PostMapping("/roles/{roleId}/users")
//    public Submission createCategorySubmission(
//            @PathVariable(value = "categoryId") Long categoryId, @RequestBody Submission recipeObject) {
//        System.out.println("calling createCategorySubmission ==>");
//        return categoryService.createCategorySubmission(categoryId, recipeObject);
//    }
//
//    @GetMapping("/roles/{categoryId}/recipes")
//    public List<Submission> getCategorySubmissions(@PathVariable(value = "categoryId") Long categoryId) {
//        System.out.println("calling getCategorySubmissions ==>");
//        return categoryService.getCategorySubmissions(categoryId);
//    }
//
//    @GetMapping("/roles/{categoryId}/recipes/{recipeId}")
//    public Submission getCategorySubmission(@PathVariable(value = "categoryId") Long categoryId, @PathVariable(value = "recipeId") Long recipeId) {
//        System.out.println("calling getCategorySubmission ==>");
//        return categoryService.getCategorySubmission(categoryId, recipeId);
//    }
//
//    @PutMapping("/roles/{categoryId}/recipes/{recipeId}")
//
//    public Submission updateCategorySubmission(@PathVariable(value = "categoryId") Long categoryId,
//                                               @PathVariable(value = "recipeId") Long recipeId,
//                                               @RequestBody Submission recipeObject) {
//        System.out.println("calling getCategorySubmission ==>");
//        return categoryService.updateCategorySubmission(categoryId, recipeId, recipeObject);
//    }
//
//    @DeleteMapping("/roles/{categoryId}/recipes/{recipeId}")
//    public ResponseEntity<HashMap> deleteCategorySubmission(
//            @PathVariable(value = "categoryId") Long categoryId, @PathVariable(value = "recipeId") Long recipeId) {
//        System.out.println("calling getCategorySubmission ==>");
//        categoryService.deleteCategorySubmission(categoryId, recipeId);
//        HashMap responseMessage = new HashMap();
//        responseMessage.put("status", "recipe with id: " + recipeId + " was successfully deleted.");
//        return new ResponseEntity<HashMap>(responseMessage, HttpStatus.OK);
//    }
//}


