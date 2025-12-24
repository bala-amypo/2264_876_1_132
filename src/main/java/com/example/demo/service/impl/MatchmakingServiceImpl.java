package com.example.demo.service.impl;

import com.example.demo.model.MatchRecord;
import com.example.demo.service.MatchmakingService;
import org.springframework.stereotype.Service;

@Service
public class MatchmakingServiceImpl implements MatchmakingService {

    public MatchmakingServiceImpl() {}

    @Override
    public MatchRecord generateMatch(Long userId) {
        throw new RuntimeException("No match found");
    }
}
