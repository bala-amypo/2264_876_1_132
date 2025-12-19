package com.example.demo.model;

import java.time.LocalDateTime;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity

public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
     private Long id;

    private String username;
    private String email;
    private String bio;
    private Boolean active;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getBio() {
        return bio;
    }
    public void setBio(String bio) {
        this.bio = bio;
    }
    public Boolean getActive() {
        return active;
    }
    public void setActive(Boolean active) {
        this.active = active;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
    public UserProfile(Long id, String username, String email, String bio, Boolean active, LocalDateTime createdAt,
            LocalDateTime updatedAt) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.bio = bio;
        this.active = active;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
    public UserProfile(){
        
    }
    
}
