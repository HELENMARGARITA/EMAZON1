package com.emazon.categories.application.service;

import com.emazon.categories.domain.model.Category;
import com.emazon.categories.domain.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    public List<Category> listCategories(boolean asc) {
        return categoryRepository.findAllOrderedByName(asc);
    }
}

