package com.spring.springtech.repository;

import com.spring.springtech.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}

//        RoleRepository extends the JpaRepository interface provided by the
//        Spring Data Commons project. The type of entity and ID that it works with,
//        Role and Long, are specified in the generic parameters on JpaRepository.
//        By extending JpaRepository, RoleRepository inherits several methods for saving,
//        deleting, and finding Role entities.
//
//        Spring Data JPA also allows you to define other query methods by declaring
//        their method signature. For example, RoleRepository declares an additional method: findByName().