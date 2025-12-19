package com.example.barter.controller;

import com.example.barter.model.SkillCategory;
import com.example.barter.service.SkillCategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class SkillCategoryController {

    private final SkillCategoryService categoryService;

    // Constructor Injection
    public SkillCategoryController(SkillCategoryService categoryService) {
        this.categoryService = categoryService;
    }

    // -------------------- Create Category (ADMIN) --------------------
    @PostMapping
    public ResponseEntity<SkillCategory> createCategory(
            @RequestBody SkillCategory category) {

        return ResponseEntity.ok(categoryService.createCategory(category));
    }

    // -------------------- Get Category By ID --------------------
    @GetMapping("/{id}")
    public ResponseEntity<SkillCategory> getCategoryById(@PathVariable Long id) {
        return ResponseEntity.ok(categoryService.getCategory(id));
    }

    // -------------------- Get All Categories --------------------
    @GetMapping
    public ResponseEntity<List<SkillCategory>> getAllCategories() {
        return ResponseEntity.ok(categoryService.getAllCategories());
    }
}
