package com.example.demo.dto;

import java.sql.Timestamp;

public class MatchRecordDto {

    private Long id;
    private Long userAId;
    private Long userBId;
    private Long skillOfferedByAId;
    private Long skillOfferedByBId;
    private Timestamp matchedAt;
    private String status;

    public MatchRecordDto() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserAId() {
        return userAId;
    }

    public void setUserAId(Long userAId) {
        this.userAId = userAId;
    }

    public Long getUserBId() {
        return userBId;
    }

    public void setUserBId(Long userBId) {
        this.userBId = userBId;
    }

    public Long getSkillOfferedByAId() {
        return skillOfferedByAId;
    }

    public void setSkillOfferedByAId(Long skillOfferedByAId) {
        this.skillOfferedByAId = skillOfferedByAId;
    }

    public Long getSkillOfferedByBId() {
        return skillOfferedByBId;
    }

    public void setSkillOfferedByBId(Long skillOfferedByBId) {
        this.skillOfferedByBId = skillOfferedByBId;
    }

    public Timestamp getMatchedAt() {
        return matchedAt;
    }

    public void setMatchedAt(Timestamp matchedAt) {
        this.matchedAt = matchedAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
