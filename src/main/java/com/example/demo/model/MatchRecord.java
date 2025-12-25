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

    public void setUserA(UserProfile u) { this.userA = u; }
    public void setUserB(UserProfile u) { this.userB = u; }

    public void setSkillOfferedByA(Skill s) { this.skillOfferedByA = s; }
    public void setSkillOfferedByB(Skill s) { this.skillOfferedByB = s; }
}
