package com.spring.springtech.repository;

import com.spring.springtech.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByName(String categoryName);

    List<Category> findByUserId(Long id);

    Category findByIdAndUserId(Long categoryId, Long id);

    Category findByUserIdAndName(Long id, String name);
}
