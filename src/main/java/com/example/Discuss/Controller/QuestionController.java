package com.example.Discuss.Controller;


import com.example.Discuss.service.QuestionCreateService;
import com.example.Discuss.dto.QuestionDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Question")
public class QuestionController {

    static int hit = 0;
    @Autowired
    private QuestionCreateService questionCreateService;

    @PostMapping("/ask")
    public ResponseEntity<?> addQuestion(@RequestBody QuestionDto questionDto)
    {
        hit++;
        System.out.println("hit");
        return  questionCreateService.addQuestion(questionDto);
    }

}
