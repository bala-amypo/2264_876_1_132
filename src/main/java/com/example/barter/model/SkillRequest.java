package com.example.barter.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "skill_requests")
public class SkillRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    private User user;

    @ManyToOne(optional = false)
    private SkillCategory skillCategory;

    @Column(nullable = false)
    private String skillName;

    @Column(nullable = false)
    private String requiredLevel;

    @Column(nullable = false)
    private String status = "OPEN";

    private LocalDateTime createdAt;

    @PrePersist
    public void onCreate() {
        createdAt = LocalDateTime.now();
    }

    public SkillRequest() {}

    public Long getId() { return id; }
    public String getSkillName() { return skillName; }
}
