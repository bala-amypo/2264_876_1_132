package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class SkillRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Skill skill;

    @ManyToOne
    private UserProfile user;

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public void setUser(UserProfile user) {
        this.user = user;
    }

    public Skill getSkill() {
        return skill;
    }

    public UserProfile getUser() {
        return user;
    }
}
