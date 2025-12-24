package com.example.demo.service.impl;

import com.example.demo.model.MatchRecord;
import com.example.demo.service.MatchService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MatchServiceImpl implements MatchService {

    @Override
    public MatchRecord get(Long id) {
        MatchRecord record = new MatchRecord();
        record.setId(id);
        return record;
    }

    @Override
    public List<MatchRecord> list() {
        return new ArrayList<>();
    }
}
