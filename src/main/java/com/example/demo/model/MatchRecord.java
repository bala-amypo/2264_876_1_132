package com.example.demo.model;

import jakarta.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "match_records")
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

    private Instant matchedAt = Instant.now();
    private String status = "PENDING";

    public MatchRecord() {}

    public MatchRecord(Long id, UserProfile userA, UserProfile userB,
                       Skill skillOfferedByA, Skill skillOfferedByB,
                       Instant matchedAt, String status) {
        this.id = id;
        this.userA = userA;
        this.userB = userB;
        this.skillOfferedByA = skillOfferedByA;
        this.skillOfferedByB = skillOfferedByB;
        this.matchedAt = matchedAt;
        this.status = status;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public UserProfile getUserA() { return userA; }
    public void setUserA(UserProfile userA) { this.userA = userA; }

    public UserProfile getUserB() { return userB; }
    public void setUserB(UserProfile userB) { this.userB = userB; }

    public Skill getSkillOfferedByA() { return skillOfferedByA; }
    public void setSkillOfferedByA(Skill skillOfferedByA) { this.skillOfferedByA = skillOfferedByA; }

    public Skill getSkillOfferedByB() { return skillOfferedByB; }
    public void setSkillOfferedByB(Skill skillOfferedByB) { this.skillOfferedByB = skillOfferedByB; }

    public Instant getMatchedAt() { return matchedAt; }
    public void setMatchedAt(Instant matchedAt) { this.matchedAt = matchedAt; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
