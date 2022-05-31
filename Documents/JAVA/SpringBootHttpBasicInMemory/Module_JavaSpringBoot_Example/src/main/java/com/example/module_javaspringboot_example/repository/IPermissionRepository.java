package com.example.module_javaspringboot_example.repository;

import com.example.module_javaspringboot_example.entities.PermissionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPermissionRepository extends JpaRepository<PermissionEntity,Long> {
    PermissionEntity findByName(String name);
}
