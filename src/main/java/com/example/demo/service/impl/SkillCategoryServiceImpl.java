package com.example.barter.service.impl;

import com.example.barter.exception.BadRequestException;
import com.example.barter.exception.ResourceNotFoundException;
import com.example.barter.model.SkillCategory;
import com.example.barter.repository.SkillCategoryRepository;
import com.example.barter.service.SkillCategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillCategoryServiceImpl implements SkillCategoryService {

    private final SkillCategoryRepository categoryRepository;

    public SkillCategoryServiceImpl(SkillCategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    // -------------------- Create Category (ADMIN) --------------------
    @Override
    public SkillCategory createCategory(SkillCategory category) {

        if (category.getCategoryName() == null ||
                category.getCategoryName().trim().isEmpty()) {
            throw new BadRequestException("Category name cannot be empty");
        }

        if (categoryRepository.findByCategoryName(category.getCategoryName()).isPresent()) {
            throw new BadRequestException("Category name already exists");
        }

        return categoryRepository.save(category);
    }

    // -------------------- Get Category By ID --------------------
    @Override
    public SkillCategory getCategory(Long id) {
        return categoryRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Category not found"));
    }

    // -------------------- Get All Categories --------------------
    @Override
    public List<SkillCategory> getAllCategories() {
        return categoryRepository.findAll();
    }
}
