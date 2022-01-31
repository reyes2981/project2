package com.spring.springtech.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String username;

    @Column
    private boolean isPublic;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Role role;

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getusername() {
        return username;
    }

    public void setusername(String username) {
        this.username = username;
    }


    @Override
    public String toString() {
        return "Recipe{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }

    public Role getRole(Role role) {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public boolean getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(boolean isPublic) {
        isPublic = isPublic;
    }
}

