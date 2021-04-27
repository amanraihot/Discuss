package com.example.Discuss.Controller;

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

    @Autowired
    private AuthService authService;


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