package com.example.Discuss.Service;


import com.example.Discuss.dto.LoginDto;
import com.example.Discuss.dto.RegisterDto;
import com.example.Discuss.helper.JwtUtil;
import com.example.Discuss.models.User;
import com.example.Discuss.repo.UserRepo;
import lombok.experimental.PackagePrivate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    @Qualifier("UserDetailsImp")
    private UserDetailsService userDetailsService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtil jwtUtil;

    public ResponseEntity<String> signup(RegisterDto registerDto)
    {
        User user = new User();
        user.setUsername(registerDto.getUsername());
        user.setPassword(passwordEncoder.encode(registerDto.getPassword()));
        user.setActive(true);
        userRepo.save(user);
        return new ResponseEntity<>("Account Created",HttpStatus.OK);
    }

   public ResponseEntity<?> login(LoginDto loginDto)
    {
        Authentication authentication = authenticationManager
                .authenticate(new UsernamePasswordAuthenticationToken(loginDto.getUsername(),loginDto.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);

        UserDetails userDetails = userDetailsService.loadUserByUsername(loginDto.getUsername());
        String token = jwtUtil.generateToken(userDetails);
        return new ResponseEntity<>(token,HttpStatus.OK);




    }

}
