package com.example.Discuss.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "user")
public class User {

    @Id
    @Column(name = "userId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userId;

    @Column(name = "username")
    @NotBlank(message = "Enter Username")
    private String username;

    @NotBlank(message = "Without password we will not let you in")
    @Column(name = "password")
    private String password;

    @Email
    @NotBlank(message = "Email id is important")
    @Column(name = "emailId")
    private String email;

    private boolean isActive;





}