package com.example.demo.model;

import java.time.LocalDateTime;

public class SkillOffer {

    private Long id;
    private Skill skill;
    private UserProfile user;
    private boolean active;
    private LocalDateTime createdAt;

    public SkillOffer() {
    }

    public SkillOffer(Long id, Skill skill, UserProfile user, boolean active, LocalDateTime createdAt) {
        this.id = id;
        this.skill = skill;
        this.user = user;
        this.active = active;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public UserProfile getUser() {
        return user;
    }

    public void setUser(UserProfile user) {
        this.user = user;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
