package com.example.demo.service.impl;

import com.example.demo.model.SkillRequest;
import com.example.demo.service.SkillRequestService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SkillRequestServiceImpl implements SkillRequestService {

    @Override
    public SkillRequest get(Long id) {
        SkillRequest request = new SkillRequest();
        request.setId(id);
        return request;
    }

    @Override
    public List<SkillRequest> list() {
        return new ArrayList<>();
    }
}
