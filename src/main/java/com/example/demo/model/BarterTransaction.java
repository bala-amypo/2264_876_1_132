package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "barter_transactions")
public class BarterTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "match_id")
    private SkillMatch match;

    @Column(nullable = false)
    private String status = "INITIATED"; // INITIATED / COMPLETED / CANCELLED

    private String offererFeedback;
    private String requesterFeedback;

    private Integer offererRating;   // 1 – 5
    private Integer requesterRating; // 1 – 5

    private LocalDateTime completedAt;
    private LocalDateTime createdAt;

    public BarterTransaction() {}

    public BarterTransaction(SkillMatch match) {
        this.match = match;
    }

    @PrePersist
    public void onCreate() {
        this.createdAt = LocalDateTime.now();
    }

    public Long getId() { return id; }
    public String getStatus() { return status; }
}
