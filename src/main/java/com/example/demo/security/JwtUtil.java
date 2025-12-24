package com.example.demo.security;

public class JwtUtil {

    public JwtUtil() {}

    public String generateToken(String email, String role, Long userId) {
        return email + ":" + role + ":" + userId;
    }
}
