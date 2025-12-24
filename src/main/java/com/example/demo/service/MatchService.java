package com.example.demo.service;

import com.example.demo.model.MatchRecord;
import java.util.List;

public interface MatchService {

    MatchRecord get(Long id);

    List<MatchRecord> list();
}
