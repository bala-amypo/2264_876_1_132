package com.example.barter.service;

import com.example.barter.model.User;

import java.util.List;

public interface UserService {

    User register(User user);

    User getById(Long id);

    List<User> getAllUsers();

    User updateRating(Long userId, Double rating);

    User findByEmail(String email);
}
