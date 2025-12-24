package com.example.demo.model;

import java.time.LocalDateTime;

public class SkillRequest {

    private Long id;
    private Skill skill;
    private UserProfile requester;
    private boolean active;
    private LocalDateTime createdAt;

    public SkillRequest() {
    }

    public SkillRequest(Long id, Skill skill, UserProfile requester, boolean active, LocalDateTime createdAt) {
        this.id = id;
        this.skill = skill;
        this.requester = requester;
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

    public UserProfile getRequester() {
        return requester;
    }

    public void setRequester(UserProfile requester) {
        this.requester = requester;
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
