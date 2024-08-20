package com.emazon.categories.infrastructure.repository;

import com.emazon.categories.domain.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JpaCategoryRepository extends JpaRepository<Category, Long> {
    List<Category> findAllByOrderByNameAsc();
    List<Category> findAllByOrderByNameDesc();
}


