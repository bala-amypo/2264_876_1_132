package com.example.demo.service;

import com.example.demo.model.MatchRecord;
import java.util.List;

public interface MatchmakingService {

    MatchRecord getMatchById(Long id);
    List<MatchRecord> getMatchesForUser(Long userId);
    MatchRecord updateMatchStatus(Long matchId, String status);
}
