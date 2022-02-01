package com.spring.springtech.controller;

import com.spring.springtech.model.Category;
import com.spring.springtech.model.Submission;
import com.spring.springtech.repository.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
//
//@RestController
//@RequestMapping(path = "/api")
//public class CategoryController {
//
//    private CategoryRepository categoryRepository;
//    private CategoryService categoryService;
//
//    @Autowired
//    public void setUserRepository(CategoryRepository categoryRepository) {
//        this.categoryRepository = categoryRepository;
//    }
//
//    @Autowired
//    public void setCategoryService(CategoryService categoryService) {
//        this.categoryService = categoryService;
//    }
//
//    @GetMapping("/categories")
//    public List<Category> getCategories() {
//        System.out.println("calling getCategories ==>");
//        return categoryService.getCategories();
//    }
//
//    @GetMapping("/hello-world")
//    public String getHelloWorld() {
//        return "hello world";
//    }
//
//    @GetMapping(path = "/categories/{categoryId}")
//    public Category getCategory(@PathVariable Long categoryId) {
//        System.out.println("calling getCategory ==>");
//        return categoryService.getCategory(categoryId);
//    }
//
//    @PostMapping("/categories/")
//    public Category createCategory(@RequestBody Category categoryObject) {
//        System.out.println("calling createCategory ==>");
//        return categoryService.createCategory(categoryObject);
//    }
//
//    @PutMapping("/categories/{categoryId}")
//    public Category updateCategory(@PathVariable(
//            value = "categoryId") Long categoryId, @RequestBody Category categoryObject) {
//        System.out.println("calling updateCategory ==>");
//        return categoryService.updateCategory(categoryId, categoryObject);
//    }
//
//    @DeleteMapping("/categories/{categoryId}")
//    public String deleteCategory(@PathVariable(value = "categoryId") Long categoryId) {
//        System.out.println("calling deleteCategory ==>");
//        return categoryService.deleteCategory(categoryId);
//    }
//
//    @PostMapping("/categories/{categoryId}/recipes")
//    public Submission createCategorysubmission(
//            @PathVariable(value = "categoryId") Long categoryId, @RequestBody Submission submissionObject) {
//        System.out.println("calling createCategorysubmission ==>");
//        return categoryService.createCategorySubmission(categoryId, submissionObject);
//    }
//
//    @GetMapping("/categories/{categoryId}/recipes")
//    public List<Submission> getCategorysubmissions(@PathVariable(value = "categoryId") Long categoryId) {
//        System.out.println("calling getCategorysubmissions ==>");
//        return categoryService.getCategorySubmissions(categoryId);
//    }
//
//    @GetMapping("/categories/{categoryId}/recipes/{recipeId}")
//    public Submission getCategorysubmission(
//            @PathVariable(value = "categoryId") Long categoryId, @PathVariable(value = "recipeId") Long recipeId) {
//        System.out.println("calling getCategorysubmission ==>");
//        return categoryService.getCategorySubmission(categoryId, recipeId);
//    }
//
//    @PutMapping("/categories/{categoryId}/recipes/{recipeId}")
//    public Submission updateCategorysubmission(@PathVariable(value = "categoryId") Long categoryId,
//                                       @PathVariable(value = "recipeId") Long recipeId,
//                                       @RequestBody Submission recipeObject) {
//        System.out.println("calling getCategorysubmission ==>");
//        return categoryService.updateCategorySubmission(categoryId, recipeId, recipeObject);
//    }
//
//    @DeleteMapping("/categories/{categoryId}/recipes/{recipeId}")
//    public ResponseEntity<HashMap> deleteCategorysubmission(
//            @PathVariable(value = "categoryId") Long categoryId, @PathVariable(value = "recipeId") Long recipeId) {
//        System.out.println("calling getCategorysubmission ==>");
//        categoryService.deleteCategorySubmission(categoryId, recipeId);
//        HashMap responseMessage = new HashMap();
//        responseMessage.put("status", "recipe with id: " + recipeId + " was successfully deleted.");
//        return new ResponseEntity<HashMap>(responseMessage, HttpStatus.OK);
//    }
//}
