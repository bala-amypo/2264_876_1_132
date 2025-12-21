package com.example.demo.security;

import org.springframework.stereotype.Component;

@Component
public class JwtUtil {

    public JwtUtil() {
    }

    public String generateToken(String email, String role, Long userId) {
        return email + ":" + role + ":" + userId;
    }
}
