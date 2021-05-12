package com.example.Discuss.repo;

import com.example.Discuss.models.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface  QuestionRepo extends JpaRepository<Question,Long> {
  Question findQuestionByQid(Long qid);

  List<Question> findAllByOrderByCreated();
}
