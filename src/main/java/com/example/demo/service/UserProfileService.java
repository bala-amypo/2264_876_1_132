package com.example.demo.service;

import com.example.demo.model.UserProfile;
import java.util.List;

public interface UserProfileService {

    UserProfile get(Long id);

    List<UserProfile> list();
}
