package com.example.Discuss.repo;

import com.example.Discuss.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
=======

import java.util.Optional;

>>>>>>> main
public interface UserRepo extends JpaRepository<User,Long> {
    Optional<User> findByUsername(String username);
}
