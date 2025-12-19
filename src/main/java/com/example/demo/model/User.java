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

    // -------------------- Getters & Setters -----
