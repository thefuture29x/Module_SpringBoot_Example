package com.example.module_javaspringboot_example.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "permission")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PermissionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @JsonIgnoreProperties("permissionEntityList")
    @ManyToMany(mappedBy = "permissionEntityList")
    private List<RoleEntity> roleEntities;

}

