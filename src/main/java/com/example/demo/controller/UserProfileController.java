package com.example.demo.controller;

import com.example.demo.model.UserProfile;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/users")
public class UserProfileController {

    private final Map<Long, UserProfile> store = new HashMap<>();

    @PostMapping
    public UserProfile create(@RequestBody UserProfile user) {
        store.put(1L, user);
        return user;
    }

    @GetMapping("/{id}")
    public UserProfile get(@PathVariable Long id) {
        return store.get(id);
    }

    @PutMapping("/deactivate/{id}")
    public void deactivate(@PathVariable Long id) {
        UserProfile u = store.get(id);
        if (u != null) u.setActive(false);
    }

    @GetMapping
    public List<UserProfile> list() {
        return new ArrayList<>(store.values());
    }
}
