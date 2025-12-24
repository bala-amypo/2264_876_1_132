package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.List;
import com.example.demo.model.SkillRequest;
import com.example.demo.repository.SkillRequestRepository;
import com.example.demo.service.SkillRequestService;

@Service
public class SkillRequestServiceImpl implements SkillRequestService {

    private final SkillRequestRepository repository;

    public SkillRequestServiceImpl(SkillRequestRepository repository) {
        this.repository = repository;
    }

    public SkillRequest createRequest(SkillRequest request) {
        return repository.save(request);
    }

    public SkillRequest updateRequest(Long id, SkillRequest request) {
        request.setId(id);
        return repository.save(request);
    }

    public SkillRequest getRequestById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("SkillRequest not found"));
    }

    public List<SkillRequest> getRequestsByUser(Long userId) {
        return repository.findByUserId(userId);
    }

    public void deactivateRequest(Long id) {
        SkillRequest req = getRequestById(id);
        req.setActive(false);
        repository.save(req);
    }
}
