package com.example.Discuss.Controller;


import com.example.Discuss.dto.AnswerDto;
import com.example.Discuss.service.AnswerCreateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/answer")
public class AnswerController {

    @Autowired
    private AnswerCreateService answerCreateService;

    @PostMapping("/add/{qId}")
    public ResponseEntity<?>  add(@PathVariable String qId, @RequestBody AnswerDto answerDto)
    {
        return  answerCreateService.addAnswer(Long.parseLong(qId),answerDto);
    }

    @PostMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable String id, @RequestBody AnswerDto answerDto)
    {
            return  answerCreateService.update(Long.parseLong(id),answerDto);
    }

    @PostMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable String id)
    {
        return  answerCreateService.delete(Long.parseLong(id));
    }
}
