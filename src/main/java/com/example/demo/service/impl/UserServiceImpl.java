package com.example.demo.service.impl;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    // ✅ Constructor Injection (MANDATORY)
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Register new user
    @Override
    public User register(User user) {

        // check duplicate email
        User existingUser = userRepository.findByEmail(user.getEmail());
        if (existingUser != null) {
            throw new RuntimeException("Email already exists");
        }

        // password should be encoded in real apps
        return userRepository.save(user);
    }

    // Find user by email
    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
