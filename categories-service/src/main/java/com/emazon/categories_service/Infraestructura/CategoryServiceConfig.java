package com.emazon.categories.infrastructure.configuration;

import com.emazon.categories.domain.repository.CategoryRepository;
import com.emazon.categories.infrastructure.repository.CategoryRepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CategoryServiceConfig {

    @Bean
    public CategoryRepository categoryRepository() {
        return new CategoryRepositoryImpl();
    }
}

