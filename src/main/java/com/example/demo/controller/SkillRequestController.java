package com.example.demo.controller;

import com.example.demo.model.SkillRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/requests")
public class SkillRequestController {

    @GetMapping("/{id}")
    public ResponseEntity<SkillRequest> get(@PathVariable Long id) {
        SkillRequest request = new SkillRequest();
        request.setId(id);
        return ResponseEntity.ok(request);
    }

    @GetMapping
    public ResponseEntity<List<SkillRequest>> list() {
        return ResponseEntity.ok(new ArrayList<>());
    }
}
