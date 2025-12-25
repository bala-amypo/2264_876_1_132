package com.example.demo.service.impl;

import com.example.demo.model.MatchRecord;
import com.example.demo.repository.MatchRecordRepository;
import com.example.demo.service.MatchmakingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchmakingServiceImpl implements MatchmakingService {

    private final MatchRecordRepository repository;

    public MatchmakingServiceImpl(MatchRecordRepository repository) {
        this.repository = repository;
    }

    @Override
    public MatchRecord generateMatch(Long userId) {
        MatchRecord match = new MatchRecord();
        match.setUserId(userId);
        match.setStatus("PENDING");
        return repository.save(match);
    }

    @Override
    public MatchRecord getMatchById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<MatchRecord> getMatchesForUser(Long userId) {
        return repository.findByUserId(userId);
    }

    @Override
    public MatchRecord updateMatchStatus(Long matchId, String status) {
        MatchRecord match = getMatchById(matchId);
        if (match != null) {
            match.setStatus(status);
            return repository.save(match);
        }
        return null;
    }
}
