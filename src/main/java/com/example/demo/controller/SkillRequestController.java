package com.example.demo.controller;

import com.example.demo.model.SkillRequest;
import com.example.demo.service.SkillRequestService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/requests")
@Tag(name = "Skill Request")
public class SkillRequestController {

    private final SkillRequestService requestService;

    public SkillRequestController(SkillRequestService requestService) {
        this.requestService = requestService;
    }

    @PostMapping
    public ResponseEntity<SkillRequest> create(@RequestBody SkillRequest request) {
        return ResponseEntity.ok(requestService.createRequest(request));
    }

    @GetMapping
    public ResponseEntity<List<SkillRequest>> getAll() {
        return ResponseEntity.ok(requestService.getOpenRequests());
    }

    @GetMapping("/{id}")
    public ResponseEntity<SkillRequest> getById(@PathVariable Long id) {
        return ResponseEntity.ok(requestService.getRequest(id));
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<SkillRequest>> getByUser(@PathVariable Long userId) {
        return ResponseEntity.ok(requestService.getRequestsByUser(userId));
    }

    @GetMapping("/category/{categoryId}")
    public ResponseEntity<List<SkillRequest>> getByCategory(@PathVariable Long categoryId) {
        return ResponseEntity.ok(requestService.getRequestsByCategory(categoryId));
    }

    @GetMapping("/open")
    public ResponseEntity<List<SkillRequest>> getOpen() {
        return ResponseEntity.ok(requestService.getOpenRequests());
    }
}
