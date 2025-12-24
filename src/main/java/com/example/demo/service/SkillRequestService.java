package com.example.demo.service;

import com.example.demo.model.SkillRequest;

public interface SkillRequestService {
    SkillRequest createRequest(SkillRequest request);
    SkillRequest getRequestById(Long id);
}
