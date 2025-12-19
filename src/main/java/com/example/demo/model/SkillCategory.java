package com.example.barter.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(
    name = "skill_categories",
    uniqueConstraints = {
        @UniqueConstraint(columnNames = "categoryName")
    }
)
public class SkillCategory {

    // -------------------- Fields --------------------

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String categoryName;

    private String description;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    // -------------------- Relationships --------------------

    @OneToMany(mappedBy = "skillCategory", cascade = CascadeType.ALL)
    private List<SkillOffer> skillOffers;

    @OneToMany(mappedBy = "skillCategory", cascade = CascadeType.ALL)
    private List<SkillRequest> skillRequests;

    // -------------------- Constructors --------------------

    public SkillCategory() {
        // No-args constructor
    }

    public SkillCategory(String categoryName, String description) {
        if (categoryName == null || categoryName.trim().isEmpty()) {
            throw new IllegalArgumentException("Category name cannot be empty");
        }
        this.categoryName = categoryName;
        this.description = description;
    }

    // -------------------- Lifecycle --------------------

    @PrePersist
    public void onCreate() {
        this.createdAt = LocalDateTime.now();
    }

    // -------------------- Getters & Setters --------------------

    public Long getId() {
        return id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        if (categoryName == null || categoryName.trim().isEmpty()) {
            throw new IllegalArgumentException("Category name cannot be empty");
        }
        this.categoryName = categoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
