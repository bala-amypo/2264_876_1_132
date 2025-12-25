package com.example.demo.controller;

import com.example.demo.model.Skill;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/skills")
public class SkillController {

    private final Map<Long, Skill> store = new HashMap<>();

    @PostMapping
    public Skill create(@RequestBody Skill s) {
        store.put(1L, s);
        return s;
    }

    @PutMapping("/{id}")
    public Skill update(@PathVariable Long id, @RequestBody Skill s) {
        store.put(id, s);
        return s;
    }

    @GetMapping
    public List<Skill> list() {
        return new ArrayList<>(store.values());
    }
}
