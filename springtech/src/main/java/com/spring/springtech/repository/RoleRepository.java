package com.spring.springtech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;

public interface RoleRepository extends JpaRepository<User, Long> {

}
