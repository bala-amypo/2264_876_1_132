package com.example.demo.controller;

import com.example.demo.model.SkillRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/requests")
public class SkillRequestController {

    @PostMapping
    public SkillRequest create(@RequestBody SkillRequest r) {
        return r;
    }

    @GetMapping("/{id}")
    public SkillRequest get(@PathVariable Long id) {
        return new SkillRequest();
    }
}
