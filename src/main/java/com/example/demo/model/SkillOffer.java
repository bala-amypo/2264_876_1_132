package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class SkillOffer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private UserProfile user;

    @ManyToOne
    private Skill skill;

    public SkillOffer() {
    }

    public SkillOffer(Long id, UserProfile user, Skill skill) {
        this.id = id;
        this.user = user;
        this.skill = skill;
    }

    public Long getId() {
        return id;
    }

    public UserProfile getUser() {
        return user;
    }

    public Skill getSkill() {
        return skill;
    }
}
