package com.example.demo.security;

import org.springframework.stereotype.Component;

import java.util.Base64;

@Component
public class JwtUtil {

    private static final String SECRET = "secret-key";

    // Used by AuthController
    public String generateToken(String email, String role, long expirationTime) {
        String tokenData = email + ":" + role + ":" + expirationTime + ":" + SECRET;
        return Base64.getEncoder().encodeToString(tokenData.getBytes());
    }

    // ✅ REQUIRED BY TEST CLASS
    public String extractUserId(String token) {
        try {
            String decoded = new String(Base64.getDecoder().decode(token));
            return decoded.split(":")[0]; // email as userId
        } catch (Exception e) {
            return null;
        }
    }

    // Used by JwtAuthFilter
    public String extractEmail(String token) {
        return extractUserId(token);
    }

    public String extractRole(String token) {
        try {
            String decoded = new String(Base64.getDecoder().decode(token));
            return decoded.split(":")[1];
        } catch (Exception e) {
            return null;
        }
    }

    public boolean validateToken(String token) {
        try {
            String decoded = new String(Base64.getDecoder().decode(token));
            return decoded.endsWith(":" + SECRET);
        } catch (Exception e) {
            return false;
        }
    }
}
