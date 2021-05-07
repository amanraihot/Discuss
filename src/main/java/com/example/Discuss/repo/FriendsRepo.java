package com.example.Discuss.repo;

import com.example.Discuss.models.Friends;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;
import java.util.Optional;

@Repository
public interface FriendsRepo extends JpaRepository<Friends, Id> {
    Optional<Friends> findFriendsById(Long id);

}
