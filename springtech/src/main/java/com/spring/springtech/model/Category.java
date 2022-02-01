package com.spring.springtech.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

//@Entity
//@Table(name = "categories")
//public class Category {
//    @Id
//    @Column
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column
//    private String name;
//
//    @Column
//    private String description;
//
//
//    @OneToMany(mappedBy = "category", orphanRemoval = true)
//    @LazyCollection(LazyCollectionOption.FALSE)
//    private List<User> userList;
//
//    /********** add user **********/
//    // many categories belong to a one user
//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    @JsonIgnore
//    private User user;
//    /********** end of user **********/
//
//    public Category(Long id, String name, String description) {
//        this.id = id;
//        this.name = name;
//        this.description = description;
//    }
//
//    public Category() {
//
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    @Override
//    public String toString() {
//        return "Category{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", description='" + description + '\'' +
//                '}';
//    }
//
//    public List<User> getUserList() {
//        return userList;
//    }
//
//    public void setUserList(List<User> recipeList) {
//        this.userList = userList;
//    }
//
//    /********** user getters and setters **********/
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//    /********** end of user getters and setters **********/
//}
