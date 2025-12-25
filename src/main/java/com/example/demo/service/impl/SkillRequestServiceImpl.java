package com.example.demo.service.impl;

import com.example.demo.model.SkillRequest;
import com.example.demo.repository.SkillRequestRepository;
import com.example.demo.service.SkillRequestService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillRequestServiceImpl implements SkillRequestService {

    private final SkillRequestRepository repository;

    public SkillRequestServiceImpl(SkillRequestRepository repository) {
        this.repository = repository;
    }

    @Override
    public SkillRequest createRequest(SkillRequest request) {
        return repository.save(request);
    }

    @Override
    public SkillRequest updateRequest(Long id, SkillRequest request) {
        SkillRequest existing = repository.findById(id).orElse(null);
        if (existing != null) {
            existing.setSkillName(request.getSkillName());
            return repository.save(existing);
        }
        return null;
    }

    @Override
    public SkillRequest getRequestById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<SkillRequest> getRequestsByUser(Long userId) {
        return repository.findByUserId(userId);
    }

    @Override
    public void deactivateRequest(Long id) {
        SkillRequest req = getRequestById(id);
        if (req != null) {
            req.setActive(false);
            repository.save(req);
        }
    }
}
