package com.spring.springtech.repository;

import com.spring.springtech.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // to login
    User findUserByEmailAddress(String emailAddress);

}
