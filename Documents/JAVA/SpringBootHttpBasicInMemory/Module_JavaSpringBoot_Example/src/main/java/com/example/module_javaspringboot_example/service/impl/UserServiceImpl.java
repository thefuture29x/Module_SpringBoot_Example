package com.example.module_javaspringboot_example.service.impl;

import com.example.module_javaspringboot_example.entities.UserEntity;
import com.example.module_javaspringboot_example.repository.IUserRepository;
import com.example.module_javaspringboot_example.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    IUserRepository iUserRepository;
    @Override
    public List<UserEntity> findAllUser() {
        return iUserRepository.findAll();
    }

    @Override
    public void saveOrUpdateUser(UserEntity userEntity) {
        iUserRepository.save(userEntity);
    }

    @Override
    public void updateUserToken(String email, String token) {
        UserEntity userEntity = iUserRepository.findByEmail(email);
        userEntity.setResetPassWordToken(token);
        iUserRepository.save(userEntity);
    }

    @Override
    public UserEntity findUserByToken(String token) {
        return iUserRepository.findByResetPassWordToken(token);
    }

    @Override
    public UserEntity findUserByEmail(String email) {
        return iUserRepository.findByEmail(email);
    }
}
