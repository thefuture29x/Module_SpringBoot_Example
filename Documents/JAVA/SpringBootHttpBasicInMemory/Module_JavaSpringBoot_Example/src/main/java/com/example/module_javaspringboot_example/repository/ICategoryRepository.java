package com.example.module_javaspringboot_example.repository;

import com.example.module_javaspringboot_example.entities.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepository extends JpaRepository<CategoryEntity,Long> {
    CategoryEntity findByName(String name);
}
