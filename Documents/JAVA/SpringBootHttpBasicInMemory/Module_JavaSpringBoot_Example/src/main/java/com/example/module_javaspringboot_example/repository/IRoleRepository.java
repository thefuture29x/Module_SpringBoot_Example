package com.example.module_javaspringboot_example.repository;

import com.example.module_javaspringboot_example.entities.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoleRepository extends JpaRepository<RoleEntity,Long> {
    RoleEntity findByRole(String roleName);
}
