package com.example.barter.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(
    name = "users",
    uniqueConstraints = {
        @UniqueConstraint(columnNames = "email")
    }
)
public class User {

    // -------------------- Fields --------------------

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String fullName;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;   // hashed only

    private String location;

    @Column(nullable = false)
    private String role = "USER";   // ADMIN / USER

    @Column(nullable = false)
    private Double rating = 0.0;    // range 0–5

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    // -------------------- Relationships --------------------

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<SkillOffer> skillOffers;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<SkillRequest> skillRequests;

    @OneToMany(mappedBy = "admin", cascade = CascadeType.ALL)
    private List<SkillMatch> skillMatches;

    // -------------------- Constructors --------------------

    public User() {
        // No-args constructor
    }

    public User(String fullName, String email, String password, String role) {
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.role = (role == null) ? "USER" : role;
        this.rating = 0.0;
    }

    // -------------------- Lifecycle --------------------

    @PrePersist
    public void onCreate() {
        this.createdAt = LocalDateTime.now();
        if (this.role == null) {
            this.role = "USER";
        }
        if (this.rating == null) {
            this.rating = 0.0;
        }
    }

    // -------------------- Getters & Setters --------------------

    public Long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // password must be HASHED before setting (handled in service)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        if (!role.equals("ADMIN") && !role.equals("USER")) {
            throw new IllegalArgumentException("Invalid role");
        }
        this.role = role;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        if (rating < 0.0 || rating > 5.0) {
            throw new IllegalArgumentException("Rating must be between 0 and 5");
        }
        this.rating = rating;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
