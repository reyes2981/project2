package com.spring.springtech.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

//@Entity
//@Table(name = "submissions")
//public class Submission {
//    @Id
//    @Column
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column
//    private String name;
//
//    @Column
//    private String time;
//
//    @Column
//    private Integer portions;
//
//    @Column
//    private String ingredients;
//
//    @Column
//    private String steps;
//
//    @Column
//    private boolean isPublic;
//
//    /********** add user **********/
//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    @JsonIgnore
//    private User user;
//    /********** end of add user **********/
//
//    @JsonIgnore
//    @ManyToOne
//    @JoinColumn(name = "category_id")
//    private Category category;
//
//    public Submission() {
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
//    public String getTime() {
//        return time;
//    }
//
//    public void setTime(String time) {
//        this.time = time;
//    }
//
//    public Integer getPortions() {
//        return portions;
//    }
//
//    public void setPortions(Integer portions) {
//        this.portions = portions;
//    }
//
//    public String getIngredients() {
//        return ingredients;
//    }
//
//    public void setIngredients(String ingredients) {
//        this.ingredients = ingredients;
//    }
//
//    public String getSteps() {
//        return steps;
//    }
//
//    public void setSteps(String steps) {
//        this.steps = steps;
//    }
//
//    @Override
//    public String toString() {
//        return "submission{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", time='" + time + '\'' +
//                ", portions=" + portions +
//                ", ingredients='" + ingredients + '\'' +
//                ", steps='" + steps + '\'' +
//                '}';
//    }
//
//    public Category getCategory() {
//        return category;
//    }
//
//    public void setCategory(Category category) {
//        this.category = category;
//    }
//
//    public boolean getIsPublic() {
//        return isPublic;
//    }
//
//    public void setIsPublic(boolean isPublic) {
//        isPublic = isPublic;
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
//    /********** user getters and setters **********/
//}

