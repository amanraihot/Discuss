package com.example.Discuss.Controller;

import com.example.Discuss.service.FriendsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/follower")
public class FriendsController {

    @Autowired
    private FriendsService friendsService;

    @PostMapping("/add/{id}")
    public ResponseEntity<?> follow(@PathVariable  String id)
    {
        System.out.println(id);
        return friendsService.followThisPerson(Long.parseLong(id));
    }

    @DeleteMapping("/remove/{id}")
    public ResponseEntity<?> unfollow(@PathVariable  String id)
    {
        System.out.println(id);
        return  friendsService.UnfollowThisPerson(Long.parseLong(id));
    }
}
