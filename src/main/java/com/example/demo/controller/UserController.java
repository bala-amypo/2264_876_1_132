package com.example.barter.controller;

import com.example.barter.model.User;
import com.example.barter.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    // Constructor Injection
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // -------------------- Get User By ID --------------------
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        return ResponseEntity.ok(userService.getById(id));
    }

    // -------------------- Get All Users --------------------
    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    // -------------------- Update User Rating --------------------
    @PutMapping("/{id}/rating")
    public ResponseEntity<User> updateUserRating(
            @PathVariable Long id,
            @RequestParam Double rating) {

        return ResponseEntity.ok(userService.updateRating(id, rating));
    }
}
