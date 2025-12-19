package com.example.barter.repository;

import com.example.barter.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    // Used to validate unique email
    boolean existsByEmail(String email);

    // Used for login / lookup
    Optional<User> findByEmail(String email);
}
