package com.example.Discuss.repo;

import com.example.Discuss.models.Question;
import org.springframework.data.jpa.repository.JpaRepository;


public interface  QuestionRepo extends JpaRepository<Question,Long> {
  Question findQuestionByQid(Long qid);
}
