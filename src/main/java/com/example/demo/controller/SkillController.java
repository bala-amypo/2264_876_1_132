package com.example.demo.controller;

import com.example.demo.model.Skill;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/skills")
public class SkillController {

    @PostMapping
    public Skill create(@RequestBody Skill s) {
        return s;
    }

    @PutMapping("/{id}")
    public Skill update(@PathVariable Long id, @RequestBody Skill s) {
        return s;
    }

    @GetMapping
    public List<Skill> list() {
        return new ArrayList<>();
    }
}
