package com.example.barter.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "skill_matches")
public class SkillMatch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "offer_id")
    private SkillOffer offer;

    @ManyToOne(optional = false)
    @JoinColumn(name = "request_id")
    private SkillRequest request;

    @ManyToOne(optional = false)
    @JoinColumn(name = "matched_by")
    private User matchedBy;

    @Column(nullable = false)
    private String matchStatus = "PENDING"; // PENDING / ACCEPTED / REJECTED / COMPLETED

    @Column(nullable = false)
    private Double matchScore = 0.0; // 0 – 100

    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "match")
    private List<BarterTransaction> transactions;

    public SkillMatch() {}

    public SkillMatch(SkillOffer offer, SkillRequest request, User matchedBy) {
        this.offer = offer;
        this.request = request;
        this.matchedBy = matchedBy;
    }

    @PrePersist
    public void onCreate() {
        this.createdAt = LocalDateTime.now();
    }

    public Long getId() { return id; }
    public String getMatchStatus() { return matchStatus; }
    public Double getMatchScore() { return matchScore; }
}
