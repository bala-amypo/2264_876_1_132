package com.example.demo.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "skill_offers")
public class SkillOffer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /* ---------- Relationships ---------- */

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserProfile user;

    @ManyToOne
    @JoinColumn(name = "skill_id", nullable = false)
    private Skill skill;

    /* ---------- Fields ---------- */

    @Column(nullable = false)
    private String experienceLevel;

    @Column(nullable = false)
    private Integer availableHoursPerWeek;

    @Column(nullable = false)
    private Boolean active = true;

    /* ---------- Validation ---------- */

    @PrePersist
    @PreUpdate
    private void validateExperienceLevel() {
        if (!experienceLevel.equalsIgnoreCase("Beginner") &&
            !experienceLevel.equalsIgnoreCase("Intermediate") &&
            !experienceLevel.equalsIgnoreCase("Expert")) {
            throw new IllegalArgumentException(
                "Experience level must be Beginner, Intermediate, or Expert"
            );
        }
    }

    /* ---------- Getters and Setters ---------- */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserProfile getUser() {
        return user;
    }

    public void setUser(UserProfile user) {
        this.user = user;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public String getExperienceLevel() {
        return experienceLevel;
    }

    public void setExperienceLevel(String experienceLevel) {
        this.experienceLevel = experienceLevel;
    }

    public Integer getAvailableHoursPerWeek() {
        return availableHoursPerWeek;
    }

    public void setAvailableHoursPerWeek(Integer availableHoursPerWeek) {
        this.availableHoursPerWeek = availableHoursPerWeek;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
