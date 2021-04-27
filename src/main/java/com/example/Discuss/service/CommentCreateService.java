package com.example.Discuss.service;

import com.example.Discuss.dto.CommentDto;
import com.example.Discuss.models.Answers;
import com.example.Discuss.models.Comments;
import com.example.Discuss.repo.AnswerRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CommentCreateService  {

    @Autowired
    private AnswerRepo answerRepo;

    @Autowired
    private AuthService authService;

    public ResponseEntity<?> addComment(CommentDto commentDto, Long aid)
    {
        Comments comment = new Comments();
        comment.setComment(commentDto.getComment());
        comment.setAnswers(answerRepo.findByAid(aid));
        comment.setUser(authService.getCurrentUser());
        return  new ResponseEntity<String>("Comment Added", HttpStatus.OK);
    }
}
