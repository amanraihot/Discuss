package com.example.Discuss.Controller;


import com.example.Discuss.repo.AnswerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feeds")
public class FeedController {

    @Autowired
    private AnswerRepo answerRepo;
    @GetMapping("/all")
    public ResponseEntity<?> latestFeed()
    {
        ret
    }
}
