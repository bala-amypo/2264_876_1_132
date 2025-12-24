package com.example.demo.controller;

import com.example.demo.model.Skill;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/skills")
public class SkillController {

    @GetMapping("/{id}")
    public ResponseEntity<Skill> get(@PathVariable Long id) {
        Skill skill = new Skill();
        skill.setId(id);
        return ResponseEntity.ok(skill);
    }

    @GetMapping
    public ResponseEntity<List<Skill>> list() {
        return ResponseEntity.ok(new ArrayList<>());
    }
}
