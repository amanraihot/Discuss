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

    public  ResponseEntity<?> update(Long id, QuestionDto questionDto)
    {
        Question question = questionRepo.findQuestionByQid(id);
        if(question.getUser() == authService.getCurrentUser())
        {
            question.setQuestion(questionDto.getQuestion());
            return new ResponseEntity<>("Question Updated",HttpStatus.OK);
        }
        return new ResponseEntity<>("You are not author of question, only authors are allowed to do update", HttpStatus.BAD_REQUEST);
    }


    public  ResponseEntity<?> delete(Long id)
    {
        Question question = questionRepo.findQuestionByQid(id);
        if(question.getUser() == authService.getCurrentUser())
        {
            questionRepo.delete(question);
            return new ResponseEntity<>("Question Deleted",HttpStatus.OK);
        }
        return new ResponseEntity<>("You are not author of question, only authors are allowed to do delete", HttpStatus.BAD_REQUEST);
    }
}
