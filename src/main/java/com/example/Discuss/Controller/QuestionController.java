package com.example.Discuss.Controller;


import com.example.Discuss.service.QuestionCreateService;
import com.example.Discuss.dto.QuestionDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/update/{id}")
    public  ResponseEntity<?> update(@PathVariable String id, @RequestBody QuestionDto questionDto)
    {
        return questionCreateService.update(Long.parseLong(id), questionDto);
    }

    @PostMapping("/delete/{id}")
    public  ResponseEntity<?> delete(@PathVariable String id, @RequestBody QuestionDto questionDto)
    {
        return questionCreateService.delete(Long.parseLong(id));
    }

}
