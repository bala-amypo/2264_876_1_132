package com.example.demo.controller;

import com.example.demo.model.UserProfile;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/users")
public class UserProfileController {

    @PostMapping
    public UserProfile create(@RequestBody UserProfile u) {
        return u;
    }

    @GetMapping("/{id}")
    public UserProfile get(@PathVariable Long id) {
        return new UserProfile();
    }

    @PutMapping("/deactivate/{id}")
    public void deactivate(@PathVariable Long id) {
    }

    @GetMapping
    public List<UserProfile> list() {
        return new ArrayList<>();
    }
}
