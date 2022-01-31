package com.spring.springtech.controller;

import com.spring.springtech.model.Category;
import com.spring.springtech.repository.CategoryRepository;
import com.spring.springtech.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class CategoryController {

    private CategoryRepository categoryRepository;
    private CategoryService categoryService;

    @Autowired
    public void setUserRepository(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Autowired
    public void setCategoryService(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/categories")
    public List<Category> getCategories() {
        System.out.println("calling getCategories ==>");
        return categoryService.getCategories();
    }

    @GetMapping("/hello-world")
    public String getHelloWorld() {
        return "hello world";
    }

    @GetMapping(path = "/categories/{categoryId}")
    public Category getCategory(@PathVariable Long categoryId) {
        System.out.println("calling getCategory ==>");
        return categoryService.getCategory(categoryId);
    }

    @PostMapping("/categories/")
    public Category createCategory(@RequestBody Category categoryObject) {
        System.out.println("calling createCategory ==>");
        return categoryService.createCategory(categoryObject);
    }

    @PutMapping("/categories/{categoryId}")
    public Category updateCategory(@PathVariable(
            value = "categoryId") Long categoryId, @RequestBody Category categoryObject) {
        System.out.println("calling updateCategory ==>");
        return categoryService.updateCategory(categoryId, categoryObject);
    }

    @DeleteMapping("/categories/{categoryId}")
    public String deleteCategory(@PathVariable(value = "categoryId") Long categoryId) {
        System.out.println("calling deleteCategory ==>");
        return categoryService.deleteCategory(categoryId);
    }

    @PostMapping("/categories/{categoryId}/recipes")
    public Recipe createCategoryRecipe(
            @PathVariable(value = "categoryId") Long categoryId, @RequestBody Recipe recipeObject) {
        System.out.println("calling createCategoryRecipe ==>");
        return categoryService.createCategoryRecipe(categoryId, recipeObject);
    }

    @GetMapping("/categories/{categoryId}/recipes")
    public List<Recipe> getCategoryRecipes(@PathVariable(value = "categoryId") Long categoryId) {
        System.out.println("calling getCategoryRecipes ==>");
        return categoryService.getCategoryRecipes(categoryId);
    }

    @GetMapping("/categories/{categoryId}/recipes/{recipeId}")
    public Recipe getCategoryRecipe(
            @PathVariable(value = "categoryId") Long categoryId, @PathVariable(value = "recipeId") Long recipeId) {
        System.out.println("calling getCategoryRecipe ==>");
        return categoryService.getCategoryRecipe(categoryId, recipeId);
    }

    @PutMapping("/categories/{categoryId}/recipes/{recipeId}")
    public Recipe updateCategoryRecipe(@PathVariable(value = "categoryId") Long categoryId,
                                       @PathVariable(value = "recipeId") Long recipeId,
                                       @RequestBody Recipe recipeObject) {
        System.out.println("calling getCategoryRecipe ==>");
        return categoryService.updateCategoryRecipe(categoryId, recipeId, recipeObject);
    }

    @DeleteMapping("/categories/{categoryId}/recipes/{recipeId}")
    public ResponseEntity<HashMap> deleteCategoryRecipe(
            @PathVariable(value = "categoryId") Long categoryId, @PathVariable(value = "recipeId") Long recipeId) {
        System.out.println("calling getCategoryRecipe ==>");
        categoryService.deleteCategoryRecipe(categoryId, recipeId);
        HashMap responseMessage = new HashMap();
        responseMessage.put("status", "recipe with id: " + recipeId + " was successfully deleted.");
        return new ResponseEntity<HashMap>(responseMessage, HttpStatus.OK);
    }
}
