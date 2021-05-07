package com.example.Discuss.repo;

import com.example.Discuss.models.User;
import org.apache.tomcat.util.buf.UDecoder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {
    Optional<User> findByUsername(String username);
    Optional<User> findByUserId(Long id);
}
