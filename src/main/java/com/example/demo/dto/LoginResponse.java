package com.example.demo.dto;

public class LoginResponse {

    private String token;
    private String role;
    private Long userId;

    // No-args constructor
    public LoginResponse() {
    }

    // All-args constructor
    public LoginResponse(String token, String role, Long userId) {
        this.token = token;
        this.role = role;
        this.userId = userId;
    }

    // Getters & Setters
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
