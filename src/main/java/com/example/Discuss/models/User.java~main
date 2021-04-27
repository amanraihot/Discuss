package com.example.Discuss.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long userId;

    @Column(name = "name")
    private String username;

    @Column(name = "password")
    private  String password;

    private boolean isActive;

}
