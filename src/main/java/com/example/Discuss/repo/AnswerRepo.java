package com.example.Discuss.repo;

import com.example.Discuss.models.Answers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AnswerRepo  extends JpaRepository<Answers,Long> {
        Answers findByAid(Long aid);
        List<Answers> findAllByOrderByCreated();
}
