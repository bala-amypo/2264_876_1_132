package com.example.demo.service;

import com.example.demo.model.Skill;
import java.util.List;

public interface SkillService {

    Skill get(Long id);

    List<Skill> list();
}
