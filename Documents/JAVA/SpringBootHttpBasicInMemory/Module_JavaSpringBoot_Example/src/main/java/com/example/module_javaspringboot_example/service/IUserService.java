package com.example.module_javaspringboot_example.service;

import com.example.module_javaspringboot_example.entities.UserEntity;

import java.util.List;

public interface IUserService {
    List<UserEntity> findAllUser();
    void saveOrUpdateUser(UserEntity userEntity);
    void updateUserToken(String email,String token);
    UserEntity findUserByToken(String token);
    UserEntity findUserByEmail(String email);
}
