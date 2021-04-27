package com.example.Discuss.Controller;


import com.example.Discuss.dto.CommentDto;
import com.example.Discuss.service.CommentCreateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comments")
public class CommentController {

    @Autowired
    private CommentCreateService commentCreateService;

    @PostMapping("/add/{aid}/")
    public ResponseEntity<?> addComment(@PathVariable String aid, @RequestBody CommentDto commentDto)
    {
        return  commentCreateService.addComment(commentDto,Long.parseLong(aid));
    }
}
