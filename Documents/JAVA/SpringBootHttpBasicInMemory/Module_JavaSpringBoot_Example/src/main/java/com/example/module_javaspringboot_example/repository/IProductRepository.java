package com.example.module_javaspringboot_example.repository;

import com.example.module_javaspringboot_example.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<ProductEntity,Long> {
    ProductEntity findByName(String name);
}
