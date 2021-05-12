package com.example.Discuss.Controller;


import com.example.Discuss.models.Answers;
import com.example.Discuss.models.Question;
import com.example.Discuss.repo.AnswerRepo;
import com.example.Discuss.repo.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/feeds")
public class FeedController {

    @Autowired
    private AnswerRepo answerRepo;

    @Autowired
    private QuestionRepo questionRepo;

    @GetMapping("/all")
    public List<Answers> latestFeed()
    {
        return answerRepo.findAllByOrderByCreated();
    }

    @GetMapping("/lastestQuestions")
    public List<Question> latestQuestions()
    {
        return questionRepo.findAllByOrderByCreated();
    }




}
