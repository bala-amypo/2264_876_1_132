package com.example.demo.controller;

import com.example.demo.model.UserProfile;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserProfileController {

    @GetMapping("/{id}")
    public ResponseEntity<UserProfile> get(@PathVariable Long id) {
        UserProfile user = new UserProfile();
        user.setId(id);
        return ResponseEntity.ok(user);
    }

    @GetMapping
    public ResponseEntity<List<UserProfile>> list() {
        return ResponseEntity.ok(new ArrayList<>());
    }
}
