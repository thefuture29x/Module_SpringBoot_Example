package com.example.module_javaspringboot_example.config;

import com.example.module_javaspringboot_example.entities.*;
import com.example.module_javaspringboot_example.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataSeeder implements ApplicationListener<ContextRefreshedEvent> {
    @Autowired
    IRoleRepository iRoleRepository;
    @Autowired
    IUserRepository iUserRepository;
    @Autowired
    IPermissionRepository iPermissionRepository;
    @Autowired
    ICategoryRepository iCategoryRepository;
    @Autowired
    IProductRepository iProductRepository;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

//        if (iPermissionRepository.findByName("READ") == null){
//            iPermissionRepository.save(new PermissionEntity(1L,"READ",null));
//        }
//        if (iPermissionRepository.findByName("EDIT") == null){
//            iPermissionRepository.save(new PermissionEntity(2L,"EDIT",null));
//        }
//        if (iPermissionRepository.findByName("DELETE") == null){
//            iPermissionRepository.save(new PermissionEntity(3L,"DELETE",null));
//        }
//        if (iPermissionRepository.findByName("CREATE") == null){
//            iPermissionRepository.save(new PermissionEntity(4L,"CREATE",null));
//        }
//        if (iPermissionRepository.findByName("FIND") == null){
//            iPermissionRepository.save(new PermissionEntity(5L,"FIND",null));
//        }
//
//        PermissionEntity permissionREAD = iPermissionRepository.findByName("READ");
//        PermissionEntity permissionEDIT = iPermissionRepository.findByName("EDIT");
//        PermissionEntity permissionDELETE = iPermissionRepository.findByName("DELETE");
//        PermissionEntity permissionCREATE = iPermissionRepository.findByName("CREATE");
//        PermissionEntity permissionFIND = iPermissionRepository.findByName("FIND");
//
//        if(iRoleRepository.findByRole("ROLE_ADMIN") == null){
//            List<PermissionEntity> listPermissionAdmin = new ArrayList<>();
//            listPermissionAdmin.add(permissionREAD);
//            listPermissionAdmin.add(permissionEDIT);
//            listPermissionAdmin.add(permissionDELETE);
//            listPermissionAdmin.add(permissionCREATE);
//            listPermissionAdmin.add(permissionFIND);
//            iRoleRepository.save(new RoleEntity(1L,"ROLE_ADMIN",null,listPermissionAdmin));
//        }
//        if(iRoleRepository.findByRole("ROLE_MENTOR") == null){
//            List<PermissionEntity> listPermissionMentor = new ArrayList<>();
//            listPermissionMentor.add(permissionREAD);
//            listPermissionMentor.add(permissionEDIT);
//            listPermissionMentor.add(permissionCREATE);
//            listPermissionMentor.add(permissionFIND);
//            iRoleRepository.save(new RoleEntity(2L,"ROLE_MENTOR",null,listPermissionMentor));
//        }
//        if(iRoleRepository.findByRole("ROLE_USER") == null){
//            List<PermissionEntity> listPermissionUser = new ArrayList<>();
//            listPermissionUser.add(permissionREAD);
//            listPermissionUser.add(permissionFIND);
//            iRoleRepository.save(new RoleEntity(3L,"ROLE_USER",null,listPermissionUser));
//        }
//
//        RoleEntity roleAdmin = iRoleRepository.findByRole("ROLE_ADMIN");
//        RoleEntity roleMentor = iRoleRepository.findByRole("ROLE_MENTOR");
//        RoleEntity roleUser = iRoleRepository.findByRole("ROLE_USER");
//
//
//        if (iUserRepository.findByEmail("admin@gmail.com") == null){
//            List<RoleEntity> list = new ArrayList<>();
//            list.add(roleAdmin);
//
//            UserEntity userEntity = new UserEntity();
//            userEntity.setId(1L);
//            userEntity.setUsername("ADMIN");
//            userEntity.setPassword(bCryptPasswordEncoder.encode("123456"));
//            userEntity.setEmail("admin@gmail.com");
//            userEntity.setAvatar(null);
//            userEntity.setEnabled(true);
//            userEntity.setAccountNonLocked(true);
//            userEntity.setFailedAttempt(0);
//            userEntity.setAuthProvider(AuthProvider.LOCAL);
//            userEntity.setLockTime(null);
//            userEntity.setResetPassWordToken(null);
//            userEntity.setRoleEntityList(list);
//
//            iUserRepository.save(userEntity);
//        }
//        if (iUserRepository.findByEmail("mentor@gmail.com") == null){
//            List<RoleEntity> list = new ArrayList<>();
//            list.add(roleMentor);
//
//            UserEntity userEntity = new UserEntity();
//            userEntity.setId(2L);
//            userEntity.setUsername("MENTOR");
//            userEntity.setPassword(bCryptPasswordEncoder.encode("123456"));
//            userEntity.setEmail("mentor@gmail.com");
//            userEntity.setAvatar(null);
//            userEntity.setEnabled(true);
//            userEntity.setAccountNonLocked(true);
//            userEntity.setFailedAttempt(0);
//            userEntity.setAuthProvider(AuthProvider.LOCAL);
//            userEntity.setLockTime(null);
//            userEntity.setResetPassWordToken(null);
//            userEntity.setRoleEntityList(list);
//
//            iUserRepository.save(userEntity);
//        }
//        if (iUserRepository.findByEmail("user@gmail.com") == null){
//            List<RoleEntity> list = new ArrayList<>();
//            list.add(roleUser);
//
//            UserEntity userEntity = new UserEntity();
//            userEntity.setId(3L);
//            userEntity.setUsername("USER");
//            userEntity.setPassword(bCryptPasswordEncoder.encode("123456"));
//            userEntity.setEmail("user@gmail.com");
//            userEntity.setAvatar(null);
//            userEntity.setEnabled(true);
//            userEntity.setAccountNonLocked(true);
//            userEntity.setFailedAttempt(0);
//            userEntity.setAuthProvider(AuthProvider.LOCAL);
//            userEntity.setLockTime(null);
//            userEntity.setResetPassWordToken(null);
//            userEntity.setRoleEntityList(list);
//
//            iUserRepository.save(userEntity);
//        }
//
//
//        if (iCategoryRepository.findByName("Category 01") == null){
//            iCategoryRepository.save(new CategoryEntity(1L,"Category 01",null));
//        }
//        if (iCategoryRepository.findByName("Category 02") == null){
//            iCategoryRepository.save(new CategoryEntity(2L,"Category 02",null));
//        }
//        if (iCategoryRepository.findByName("Category 03") == null){
//            iCategoryRepository.save(new CategoryEntity(3L,"Category 03",null));
//        }
//        if (iCategoryRepository.findByName("Category 04") == null){
//            iCategoryRepository.save(new CategoryEntity(4L,"Category 04",null));
//        }
//
//        CategoryEntity category01 = iCategoryRepository.findByName("Category 01");
//        CategoryEntity category02 = iCategoryRepository.findByName("Category 02");
//        CategoryEntity category03 = iCategoryRepository.findByName("Category 03");
//        CategoryEntity category04 = iCategoryRepository.findByName("Category 04");
//
//        if (iProductRepository.findByName("Product 01") == null){
//            iProductRepository.save(new ProductEntity(1L,"Product 01",1000,100,"Description 01",null,category01));
//        }
//        if (iProductRepository.findByName("Product 02") == null){
//            iProductRepository.save(new ProductEntity(2L,"Product 02",1000,100,"Description 02",null,category01));
//        }
//        if (iProductRepository.findByName("Product 03") == null){
//            iProductRepository.save(new ProductEntity(3L,"Product 03",1000,100,"Description 03",null,category02));
//        }
//        if (iProductRepository.findByName("Product 04") == null){
//            iProductRepository.save(new ProductEntity(4L,"Product 04",1000,100,"Description 04",null,category02));
//        }
//        if (iProductRepository.findByName("Product 05") == null){
//            iProductRepository.save(new ProductEntity(5L,"Product 05",1000,100,"Description 05",null,category03));
//        }
//        if (iProductRepository.findByName("Product 06") == null){
//            iProductRepository.save(new ProductEntity(6L,"Product 06",1000,100,"Description 06",null,category03));
//        }
//        if (iProductRepository.findByName("Product 07") == null){
//            iProductRepository.save(new ProductEntity(7L,"Product 07",1000,100,"Description 07",null,category04));
//        }
//        if (iProductRepository.findByName("Product 08") == null){
//            iProductRepository.save(new ProductEntity(8L,"Product 08",1000,100,"Description 08",null,category04));
//        }
//
    }
}
