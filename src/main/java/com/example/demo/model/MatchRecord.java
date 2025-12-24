package com.example.demo.model;

import java.time.LocalDateTime;

public class MatchRecord {

    private Long id;
    private SkillOffer offer;
    private SkillRequest request;
    private LocalDateTime matchedAt;

    public MatchRecord() {
    }

    public MatchRecord(Long id, SkillOffer offer, SkillRequest request, LocalDateTime matchedAt) {
        this.id = id;
        this.offer = offer;
        this.request = request;
        this.matchedAt = matchedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SkillOffer getOffer() {
        return offer;
    }

    public void setOffer(SkillOffer offer) {
        this.offer = offer;
    }

    public SkillRequest getRequest() {
        return request;
    }

    public void setRequest(SkillRequest request) {
        this.request = request;
    }

    public LocalDateTime getMatchedAt() {
        return matchedAt;
    }

    public void setMatchedAt(LocalDateTime matchedAt) {
        this.matchedAt = matchedAt;
    }
}
