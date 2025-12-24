package com.example.demo.service.impl;

import com.example.demo.model.UserProfile;
import com.example.demo.service.UserProfileService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserProfileServiceImpl implements UserProfileService {

    @Override
    public UserProfile get(Long id) {
        UserProfile user = new UserProfile();
        user.setId(id);
        return user;
    }

    @Override
    public List<UserProfile> list() {
        return new ArrayList<>();
    }
}
