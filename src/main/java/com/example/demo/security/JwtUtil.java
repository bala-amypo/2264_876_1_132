package com.example.demo.security;

import org.springframework.stereotype.Component;

import java.util.Base64;

@Component
public class JwtUtil {

    private static final String SECRET = "secret-key";

    public String generateToken(String email, String role, long userId) {
        String tokenData = email + ":" + role + ":" + userId + ":" + SECRET;
        return Base64.getEncoder().encodeToString(tokenData.getBytes());
    }

    public String extractEmail(String token) {
        try {
            String decoded = new String(Base64.getDecoder().decode(token));
            return decoded.split(":")[0];
        } catch (Exception e) {
            return null;
        }
    }

    public String extractRole(String token) {
        try {
            String decoded = new String(Base64.getDecoder().decode(token));
            return decoded.split(":")[1];
        } catch (Exception e) {
            return null;
        }
    }

    // ✅ FIXED METHOD
    public Long extractUserId(String token) {
        try {
            String decoded = new String(Base64.getDecoder().decode(token));
            return Long.valueOf(decoded.split(":")[2]); // <-- CORRECT
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
