package com.example.demo.service;

import com.example.demo.model.SkillRequest;
import java.util.List;

public interface SkillRequestService {

    SkillRequest get(Long id);

    List<SkillRequest> list();
}
