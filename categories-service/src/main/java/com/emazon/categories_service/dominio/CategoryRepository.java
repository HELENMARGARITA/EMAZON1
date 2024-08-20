package com.emazon.categories.domain.repository;

import com.emazon.categories.domain.model.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryRepository {
    Optional<Category> findById(Long id);
    List<Category> findAll();
    List<Category> findAllOrderedByName(boolean asc);
    Category save(Category category);
    void deleteById(Long id);
}
