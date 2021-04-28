package com.example.Discuss.service;


import com.example.Discuss.dto.AnswerDto;
import com.example.Discuss.models.Answers;
import com.example.Discuss.models.Question;
import com.example.Discuss.repo.AnswerRepo;
import com.example.Discuss.repo.QuestionRepo;
import com.example.Discuss.repo.UserRepo;
import lombok.AllArgsConstructor;
import org.aspectj.apache.bcel.generic.RET;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AnswerCreateService {

    @Autowired
    private AnswerRepo answerRepo;

    @Autowired
    private AuthService authService;

    @Autowired
    private QuestionRepo questionRepo;

    public ResponseEntity<?> addAnswer(Long qid,AnswerDto answerDto)
    {
        Answers answers = new Answers();
        answers.setAnswer(answerDto.getAnswer());
        answers.setUser(authService.getCurrentUser());
        answers.setQuestion(questionRepo.findQuestionByQid(qid));
        answerRepo.save(answers);
        return new ResponseEntity<>("Answer added", HttpStatus.OK);
    }

    public  ResponseEntity<?> update(Long id, AnswerDto answerDto)
    {
        Answers answers = answerRepo.findByAid(id);
        if(answers.getUser() == authService.getCurrentUser())
        {
            answers.setAnswer(answerDto.getAnswer());
            return  new ResponseEntity<>("Answer updated",HttpStatus.OK);
        }
        return new ResponseEntity<>("Only original author is allowed to update", HttpStatus.BAD_REQUEST);
    }

    public  ResponseEntity<?> delete(Long id)
    {
        Answers answers = answerRepo.findByAid(id);
        if(answers.getUser() == authService.getCurrentUser())
        {
            answerRepo.delete(answers);
            return  new ResponseEntity<>("Answer deleted",HttpStatus.OK);
        }
        return new ResponseEntity<>("Only original author is allowed to update", HttpStatus.BAD_REQUEST);
    }



}
