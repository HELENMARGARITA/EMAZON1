package com.emazon.categories.infrastructure.repository;

import com.emazon.categories.domain.model.Category;
import com.emazon.categories.domain.repository.CategoryRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CategoryRepositoryImpl implements CategoryRepository {

    private final JpaCategoryRepository jpaCategoryRepository;

    public CategoryRepositoryImpl(JpaCategoryRepository jpaCategoryRepository) {
        this.jpaCategoryRepository = jpaCategoryRepository;
    }

    @Override
    public Optional<Category> findById(Long id) {
        return jpaCategoryRepository.findById(id);
    }

    @Override
    public List<Category> findAll() {
        return jpaCategoryRepository.findAll();
    }

    @Override
    public List<Category> findAllOrderedByName(boolean asc) {
        return asc ? jpaCategoryRepository.findAllByOrderByNameAsc() : jpaCategoryRepository.findAllByOrderByNameDesc();
    }

    @Override
    public Category save(Category category) {
        return jpaCategoryRepository.save(category);
    }

    @Override
    public void deleteById(Long id) {
        jpaCategoryRepository.deleteById(id);
    }
}
