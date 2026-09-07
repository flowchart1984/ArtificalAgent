package com.helloworld.validationexample.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="USERS_TBL")
@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "build")
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String name;
    private String mobile;
    private String gender;
    private int age;
    private String nationlity;
}
