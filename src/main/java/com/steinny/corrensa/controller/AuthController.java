package com.steinny.corrensa.controller;

import com.steinny.corrensa.dto.LoginRequest;
import com.steinny.corrensa.dto.RegisterRequest;
import com.steinny.corrensa.services.AuthService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/api/auth")
@AllArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody RegisterRequest registerRequest){
        authService.signup(registerRequest);
        return new ResponseEntity<>("User Registration succeeded", OK);
    }
    @GetMapping("accountVerificationToken/{token}")
    public ResponseEntity<String> verifyAccount(@PathVariable String token){
        authService.verifyAccount(token);
        return new ResponseEntity<>("Account successfully verified",OK);
    }

    @PostMapping("/login")
    public void login(@RequestBody LoginRequest loginRequest){
        authService.login(loginRequest);
    }

}
