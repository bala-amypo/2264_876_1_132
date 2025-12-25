package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class SkillOffer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private String skillName;
    private boolean active = true;

    public SkillOffer() {}

    public SkillOffer(Long userId, String skillName) {
        this.userId = userId;
        this.skillName = skillName;
    }

    public Long getId() { return id; }
    public Long getUserId() { return userId; }
    public String getSkillName() { return skillName; }
    public boolean isActive() { return active; }

    public void setId(Long id) { this.id = id; }
    public void setUserId(Long userId) { this.userId = userId; }
    public void setSkillName(String skillName) { this.skillName = skillName; }
    public void setActive(boolean active) { this.active = active; }
}
