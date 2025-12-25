package com.example.demo.security;

import org.springframework.stereotype.Component;

import java.util.Base64;

@Component
public class JwtUtil {

    private static final String SECRET = "secret-key";

    // ✅ Method REQUIRED by AuthController
    public String generateToken(String email, String role, long expirationTime) {

        String tokenData = email + ":" + role + ":" + expirationTime + ":" + SECRET;
        return Base64.getEncoder().encodeToString(tokenData.getBytes());
    }

    // Extract email
    public String extractEmail(String token) {
        try {
            String decoded = new String(Base64.getDecoder().decode(token));
            return decoded.split(":")[0];
        } catch (Exception e) {
            return null;
        }
    }

    // Extract role (optional but useful)
    public String extractRole(String token) {
        try {
            String decoded = new String(Base64.getDecoder().decode(token));
            return decoded.split(":")[1];
        } catch (Exception e) {
            return null;
        }
    }

    // Validate token
    public boolean validateToken(String token) {
        try {
            String decoded = new String(Base64.getDecoder().decode(token));
            return decoded.endsWith(":" + SECRET);
        } catch (Exception e) {
            return false;
        }
    }
}
