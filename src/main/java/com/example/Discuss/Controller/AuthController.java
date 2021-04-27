package com.example.Discuss.Controller;

<<<<<<< HEAD
import com.example.Discuss.dto.AuthenticationResponse;
import com.example.Discuss.dto.LoginRequest;
import com.example.Discuss.dto.RegisterRequest;
import com.example.Discuss.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
=======

import com.example.Discuss.Service.AuthService;
import com.example.Discuss.dto.LoginDto;
import com.example.Discuss.dto.RegisterDto;
import com.example.Discuss.models.User;
import com.example.Discuss.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.ParameterResolutionDelegate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/auth")
public class AuthController   {
>>>>>>> main

    @Autowired
    private AuthService authService;

<<<<<<< HEAD

    @GetMapping("/hola")
    public  String hola()
    {
        return new String("hole");
    }

    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody RegisterRequest registerRequest)
    {
        return authService.signup(registerRequest);
    }

    @PostMapping("/login")
    public AuthenticationResponse login(@RequestBody LoginRequest loginRequest)
    {
        return authService.login(loginRequest);
    }
}
=======
    @Autowired
    @Qualifier("UserDetailsImp")
    private UserDetailsService userDetailsService;

    @Autowired
    private UserRepo userRepo;


    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody RegisterDto registerDto)
    {
        Optional<User> user = userRepo.findByUsername(registerDto.getUsername());
        if(user.isPresent())return new ResponseEntity<>("username already exists choose a different one", HttpStatus.IM_USED);
            return authService.signup(registerDto);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginDto loginDto)
    {
        return authService.login(loginDto);
    }



}
>>>>>>> main
