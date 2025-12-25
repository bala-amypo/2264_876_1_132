package com.example.demo.security;

import java.util.Base64;

public class JwtUtil {

    // Simple token generator (NO external library)
    public String generateToken(String username, String role, long expirationMillis) {

        long expiryTime = System.currentTimeMillis() + expirationMillis;

        String tokenData = username + ":" + role + ":" + expiryTime;

        return Base64.getEncoder().encodeToString(tokenData.getBytes());
    }
}
