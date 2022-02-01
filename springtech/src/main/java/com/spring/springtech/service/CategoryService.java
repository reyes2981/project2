package com.spring.springtech.service;

import com.spring.springtech.model.Category;
import com.spring.springtech.model.Submission;
import com.spring.springtech.repository.CategoryRepository;
import com.spring.springtech.repository.SubmissionRepository;

//@Service
//public class CategoryService {
//
//    private CategoryRepository categoryRepository;
//
//
//    @Autowired
//    public void setCategoryRepository(CategoryRepository categoryRepository) {
//        this.categoryRepository = categoryRepository;
//    }
//
//    @Autowired
//    public void setSubmissionRepository(SubmissionRepository submissionRepository) {
//        this.submissionRepository = submissionRepository;
//    }
//
//    public List<Category> getCategories() {
//        System.out.println("service calling getCategories ==>");
//        MyUserDetails userDetails = (MyUserDetails) SecurityContextHolder.getContext().getAuthentication()
//                .getPrincipal();
//        System.out.println(userDetails.getUser().getId());
//        List<Category> category = categoryRepository.findByUserId(userDetails.getUser().getId());
//        if (category.isEmpty()) {
//            throw new InformationNotFoundException("no categories found for user id " + userDetails.getUser().getId());
//        } else {
//            return category;
//        }
//    }
//
//    public Category getCategory(Long categoryId) {
//        System.out.println("service calling getCategory ==>");
//        MyUserDetails userDetails = (MyUserDetails) SecurityContextHolder.getContext().getAuthentication()
//                .getPrincipal();
//        Category category = categoryRepository.findByIdAndUserId(categoryId, userDetails.getUser().getId());
//        if (category == null) {
//            throw new InformationNotFoundException("category with id " + categoryId + " not found");
//        } else {
//            return category;
//        }
//    }
//    public Category createCategory(Category categoryObject) {
//        System.out.println("service calling createCategory ==>");
//        MyUserDetails userDetails = (MyUserDetails) SecurityContextHolder.getContext().getAuthentication()
//                .getPrincipal();
//        Category category = categoryRepository.findByUserIdAndName(
//                userDetails.getUser().getId(), categoryObject.getName());
//        if (category != null) {
//            throw new InformationExistException("category with name " + category.getName() + " already exists");
//        } else {
//            categoryObject.setUser(userDetails.getUser());
//            return categoryRepository.save(categoryObject);
//        }
//    }
//    public Category updateCategory(Long categoryId, Category categoryObject) {
//        System.out.println("service calling updateCategory ==>");
//        MyUserDetails userDetails = (MyUserDetails) SecurityContextHolder.getContext().getAuthentication()
//                .getPrincipal();
//        Category category = categoryRepository.findByIdAndUserId(categoryId, userDetails.getUser().getId());
//        if (category == null) {
//            throw new InformationNotFoundException("category with id " + categoryId + " not found");
//        } else {
//            category.setDescription(categoryObject.getDescription());
//            category.setName(categoryObject.getName());
//            category.setUser(userDetails.getUser());
//            return categoryRepository.save(category);
//        }
//    }
//    public String deleteCategory(Long categoryId) {
//        System.out.println("service calling deleteCategory ==>");
//        MyUserDetails userDetails = (MyUserDetails) SecurityContextHolder.getContext().getAuthentication()
//                .getPrincipal();
//        Category category = categoryRepository.findByIdAndUserId(categoryId, userDetails.getUser().getId());
//        if (category == null) {
//            throw new InformationNotFoundException("category with id " + categoryId + " not found");
//        } else {
//            categoryRepository.deleteById(categoryId);
//            return "category with id " + categoryId + " has been successfully deleted";
//        }
//    }
//    public Submission createCategorySubmission(Long categoryId, Submission submissionObject) {
//        System.out.println("service calling createCategorysubmission ==>");
//        MyUserDetails userDetails = (MyUserDetails) SecurityContextHolder.getContext().getAuthentication()
//                .getPrincipal();
//        Category category = categoryRepository.findByIdAndUserId(categoryId, userDetails.getUser().getId());
//        if (category == null) {
//            throw new InformationNotFoundException(
//                    "category with id " + categoryId + " not belongs to this user or category does not exist");
//        }
//        Submission submission = submissionRepository.findByNameAndIdIsNot(submissionObject.getName(), userDetails.getUser().getId());
//        if (submission != null) {
//            throw new InformationExistException("submission with name " + submission.getName() + " already exists");
//        }
//        submissionObject.setUser(userDetails.getUser());
//        submissionObject.setCategory(category);
//        return submissionRepository.save(submissionObject);
//    }
//
//
//    public List<Submission> getCategorySubmissions(Long categoryId) {
//        System.out.println("service calling getCategorySubmissions ==>");
//        MyUserDetails userDetails = (MyUserDetails) SecurityContextHolder.getContext().getAuthentication()
//                .getPrincipal();
//        Category category = categoryRepository.findByIdAndUserId(categoryId, userDetails.getUser().getId());
//        if (category == null) {
//            throw new InformationNotFoundException("category with id " + categoryId + " " +
//                    "not belongs to this user or category does not exist");
//        }
//        return category.getSubmissionList();
//    }
//
//    public Submission getCategorySubmission(Long categoryId, Long submissionId) {
//        System.out.println("service calling getCategorysubmission ==>");
//        MyUserDetails userDetails = (MyUserDetails) SecurityContextHolder.getContext().getAuthentication()
//                .getPrincipal();
//        Category category = categoryRepository.findByIdAndUserId(categoryId, userDetails.getUser().getId());
//        if (category == null) {
//            throw new InformationNotFoundException("category with id " + categoryId +
//                    " not belongs to this user or category does not exist");
//        }
//        Optional<Submission> submission = submissionRepository.findByCategoryId(
//                categoryId).stream().filter(p -> p.getId().equals(submissionId)).findFirst();
//        if (!submission.isPresent()) {
//            throw new InformationNotFoundException("submission with id " + submissionId +
//                    " not belongs to this user or submission does not exist");
//        }
//        return submission.get();
//    }
//
//
//    public Submission updateCategorySubmission(Long categoryId, Long submissionId, Submission submissionObject) {
//        System.out.println("service calling updateCategorysubmission ==>");
//        MyUserDetails userDetails = (MyUserDetails) SecurityContextHolder.getContext().getAuthentication()
//                .getPrincipal();
//        Category category = categoryRepository.findByIdAndUserId(categoryId, userDetails.getUser().getId());
//        if (category == null) {
//            throw new InformationNotFoundException("category with id " + categoryId +
//                    " not belongs to this user or category does not exist");
//        }
//        Optional<Submission> submission = submissionRepository.findByCategoryId(
//                categoryId).stream().filter(p -> p.getId().equals(submissionId)).findFirst();
//        if (!submission.isPresent()) {
//            throw new InformationNotFoundException("submission with id " + submissionId +
//                    " not belongs to this user or submission does not exist");
//        }
//        Submission oldsubmission = submissionRepository.findByNameAndIdIsNot(
//                submissionObject.getName(), userDetails.getUser().getId());
//        if (oldsubmission != null) {
//            throw new InformationExistException("submission with name " + oldsubmission.getName() + " already exists");
//        }
//        submission.get().setName(submissionObject.getName());
//        submission.get().setIngredients(submissionObject.getIngredients());
//        submission.get().setSteps(submissionObject.getSteps());
//        submission.get().setTime(submissionObject.getTime());
//        submission.get().setPortions(submissionObject.getPortions());
//        return submissionRepository.save(submission.get());
//    }
//
//    public void deleteCategorySubmission(Long categoryId, Long submissionId) {
//        System.out.println("service calling deleteCategorysubmission ==>");
//        MyUserDetails userDetails = (MyUserDetails) SecurityContextHolder.getContext().getAuthentication()
//                .getPrincipal();
//        Category category = categoryRepository.findByIdAndUserId(categoryId, userDetails.getUser().getId());
//        if (category == null) {
//            throw new InformationNotFoundException("category with id " + categoryId +
//                    " not belongs to this user or category does not exist");
//        }
//        Optional<Submission> submission = submissionRepository.findByCategoryId(
//                categoryId).stream().filter(p -> p.getId().equals(submissionId)).findFirst();
//        if (!submission.isPresent()) {
//            throw new InformationNotFoundException("submission with id " + submissionId +
//                    " not belongs to this user or submission does not exist");
//        }
//        submissionRepository.deleteById(submission.get().getId());
//    }
//}