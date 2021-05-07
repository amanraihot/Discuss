package com.example.Discuss.service;

import com.example.Discuss.Exceptions.FollowerNotFoundException;
import com.example.Discuss.models.Friends;
import com.example.Discuss.models.User;
import com.example.Discuss.repo.FriendsRepo;
import com.example.Discuss.repo.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@AllArgsConstructor
public class FriendsService {

    @Autowired
    private FriendsRepo friendsRepo;

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private AuthService authService;

    public ResponseEntity<?> followThisPerson(Long id) {
        Optional<User> f1 = userRepo.findByUserId(id);
        User curr = f1.orElseThrow(() -> new UsernameNotFoundException("User Not Found"));
        Friends friends = new Friends();
        friends.setFollowing(authService.getCurrentUser());
        friends.setFollower(curr);
        friendsRepo.save(friends);
        return new ResponseEntity<>("followed" + curr.getUsername(), HttpStatus.ACCEPTED);
    }

    public ResponseEntity<?> UnfollowThisPerson(Long id) {
        Optional<Friends> f1 = friendsRepo.findFriendsById(id);
        Friends requestedRelation = f1.orElseThrow(()->(new FollowerNotFoundException("Friends Not found")));

        String name = requestedRelation.getFollower().getUsername();
        friendsRepo.delete(requestedRelation);
        return new ResponseEntity<>("Unfollowed" + name,HttpStatus.OK);
    }

}
