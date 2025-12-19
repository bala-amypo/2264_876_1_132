package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "skill_offers")
public class SkillOffer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    private User user;

    @ManyToOne(optional = false)
    private SkillCategory skillCategory;

    @Column(nullable = false)
    private String skillName;

    private String description;

    @Column(nullable = false)
    private String experienceLevel; // BEGINNER / INTERMEDIATE / EXPERT

    @Column(nullable = false)
    private String availability = "AVAILABLE";

    private LocalDateTime createdAt;

    @PrePersist
    public void onCreate() {
        createdAt = LocalDateTime.now();
    }

    public SkillOffer() {}

    /* Getters & Setters */

    public Long getId() { return id; }
    public String getSkillName() { return skillName; }
    public void setSkillName(String skillName) { this.skillName = skillName; }
}
