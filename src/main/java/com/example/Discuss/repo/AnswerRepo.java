package com.example.Discuss.repo;

import com.example.Discuss.models.Answers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepo  extends JpaRepository<Answers,Long> {
        Answers findByAid(Long aid);
}
