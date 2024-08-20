package com.emazon.categories.infrastructure.controller;

import com.emazon.categories.domain.model.Category;
import com.emazon.categories.application.service.CategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping
    public ResponseEntity<Category> createCategory(@RequestBody Category category) {
        return ResponseEntity.ok(categoryService.createCategory(category));
    }

    @GetMapping
    public ResponseEntity<List<Category>> listCategories(@RequestParam(defaultValue = "true") boolean asc) {
        return ResponseEntity.ok(categoryService.listCategories(asc));
    }
}

