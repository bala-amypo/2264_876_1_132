package com.example.barter.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "users", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String fullName;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password; // BCrypt hashed only

    private String location;

    @Column(nullable = false)
    private String role = "USER"; // ADMIN / USER

    @Column(nullable = false)
    private Double rating = 0.0;

    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "user")
    private List<SkillOffer> skillOffers;

    @OneToMany(mappedBy = "user")
    private List<SkillRequest> skillRequests;

    @PrePersist
    public void onCreate() {
        createdAt = LocalDateTime.now();
    }

    public User() {}

    public User(String fullName, String email, String password) {
        this.fullName = fullName;
        this.email = email;
        this.password = password;
    }

    /* Getters & Setters */

    public Long getId() { return id; }
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public Double getRating() { return rating; }
    public void setRating(Double rating) { this.rating = rating; }
}
