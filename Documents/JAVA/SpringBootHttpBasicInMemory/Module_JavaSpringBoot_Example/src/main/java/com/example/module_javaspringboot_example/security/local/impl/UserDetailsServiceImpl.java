package com.example.module_javaspringboot_example.security.local.impl;

import com.example.module_javaspringboot_example.entities.UserEntity;
import com.example.module_javaspringboot_example.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    IUserRepository iUserRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity = iUserRepository.findByEmail(username);
        if (username == null){
            throw new UsernameNotFoundException("User not found !");
        }
        return new UserDetailsImpl(userEntity);
    }
}
