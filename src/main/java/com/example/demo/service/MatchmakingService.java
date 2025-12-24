package com.example.demo.service;

import com.example.demo.model.MatchRecord;

public interface MatchmakingService {
    MatchRecord generateMatch(Long userId);
}
