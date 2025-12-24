package com.example.demo.service.impl;

import com.example.demo.model.Skill;
import com.example.demo.service.SkillService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SkillServiceImpl implements SkillService {

    @Override
    public Skill get(Long id) {
        Skill skill = new Skill();
        skill.setId(id);
        return skill;
    }

    @Override
    public List<Skill> list() {
        return new ArrayList<>();
    }
}
