package com.example.module_javaspringboot_example.repository;

import com.example.module_javaspringboot_example.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<UserEntity,Long> {
    UserEntity findByEmail(String email);
    UserEntity findByResetPassWordToken(String email);
}
