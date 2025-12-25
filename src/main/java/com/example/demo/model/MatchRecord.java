package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class MatchRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private UserProfile userA;

    @ManyToOne
    private UserProfile userB;

    @ManyToOne
    private Skill skillOfferedByA;

    @ManyToOne
    private Skill skillOfferedByB;

    public void setUserA(UserProfile userA) {
        this.userA = userA;
    }

    public void setUserB(UserProfile userB) {
        this.userB = userB;
    }

    public void setSkillOfferedByA(Skill skill) {
        this.skillOfferedByA = skill;
    }

    public void setSkillOfferedByB(Skill skill) {
        this.skillOfferedByB = skill;
    }
}
