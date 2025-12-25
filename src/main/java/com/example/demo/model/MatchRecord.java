package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class MatchRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;          
    private String status;

    public MatchRecord() {
    }

    public MatchRecord(Long userId, String status) {
        this.userId = userId;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public Long getUserId() {     
        return userId;
    }

    public String getStatus() {
        return status;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUserId(Long userId) {   // 🔥 ADD THIS
        this.userId = userId;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
