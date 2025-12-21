package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.List;
import com.example.demo.model.MatchRecord;
import com.example.demo.repository.MatchRecordRepository;
import com.example.demo.service.MatchmakingService;

@Service
public class MatchmakingServiceImpl implements MatchmakingService {

    private final MatchRecordRepository repository;

    public MatchmakingServiceImpl(MatchRecordRepository repository) {
        this.repository = repository;
    }

    public MatchRecord generateMatch(Long userId) {
        MatchRecord match = new MatchRecord();
        return repository.save(match);
    }

    public MatchRecord getMatchById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("MatchRecord not found"));
    }

    public List<MatchRecord> getMatchesForUser(Long userId) {
        return repository.findByUserAIdOrUserBId(userId, userId);
    }

    public MatchRecord updateMatchStatus(Long id, String status) {
        MatchRecord match = getMatchById(id);
        match.setStatus(status);
        return repository.save(match);
    }
}
