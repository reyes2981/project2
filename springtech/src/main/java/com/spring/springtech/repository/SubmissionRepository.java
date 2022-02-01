package com.spring.springtech.repository;

import com.spring.springtech.model.Submission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubmissionRepository extends JpaRepository<Submission, Long> {

    Submission findByName(String recipeName);

    Submission findByNameAndIdIsNot(String recipeName, Long recipeId);

    List<Submission> findByCategoryId(Long recipeId);
}
