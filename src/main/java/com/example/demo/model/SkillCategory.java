package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "skill_categories")
public class SkillCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String categoryName;

    private String description;

    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "skillCategory")
    private List<SkillOffer> skillOffers;

    @OneToMany(mappedBy = "skillCategory")
    private List<SkillRequest> skillRequests;

    public SkillCategory() {}

    public SkillCategory(String categoryName, String description) {
        this.categoryName = categoryName;
        this.description = description;
    }

    @PrePersist
    public void onCreate() {
        this.createdAt = LocalDateTime.now();
    }

    public Long getId() { return id; }
    public String getCategoryName() { return categoryName; }
    public void setCategoryName(String categoryName) { this.categoryName = categoryName; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}
