package com.example.Discuss.service;


import com.example.Discuss.dto.QuestionDto;
import com.example.Discuss.models.Question;
import com.example.Discuss.repo.QuestionRepo;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class QuestionCreateService {

    @Autowired
    private QuestionRepo questionRepo;

    @Autowired
    private AuthService authService;

    public ResponseEntity<?> addQuestion(QuestionDto questionDto)
    {
        Question question = new Question();
        question.setQuestion(questionDto.getQuestion());
        question.setUser(authService.getCurrentUser());
        question.setCreated(Instant.now());
        questionRepo.save(question);
        return new ResponseEntity<>("Question Asked", HttpStatus.OK);
    }
}
