package com.example.barter.service.impl;

import com.example.barter.exception.BadRequestException;
import com.example.barter.exception.ResourceNotFoundException;
import com.example.barter.model.User;
import com.example.barter.repository.UserRepository;
import com.example.barter.service.UserService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
        this.passwordEncoder = new BCryptPasswordEncoder();
    }

    // -------------------- Register User --------------------
    @Override
    public User register(User user) {

        if (userRepository.existsByEmail(user.getEmail())) {
            throw new BadRequestException("Email already in use");
        }

        // Hash password before saving
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        // Default role
        if (user.getRole() == null) {
            user.setRole("USER");
        }

        return userRepository.save(user);
    }

    // -------------------- Get User By ID --------------------
    @Override
    public User getById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("User not found"));
    }

    // -------------------- Get All Users --------------------
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // -------------------- Update Rating --------------------
    @Override
    public User updateRating(Long userId, Double rating) {

        if (rating < 0.0 || rating > 5.0) {
            throw new BadRequestException("Rating must be between 0 and 5");
        }

        User user = getById(userId);
        user.setRating(rating);

        return userRepository.save(user);
    }

    // -------------------- Find By Email --------------------
    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email)
                .orElseThrow(() ->
                        new ResourceNotFoundException("User not found"));
    }
}
