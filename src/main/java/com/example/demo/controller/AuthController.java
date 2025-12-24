package com.example.demo.controller;

import com.example.demo.dto.RegisterRequest;
import com.example.demo.security.JwtUtil;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final JwtUtil jwtUtil;

    public AuthController(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/register")
    public String register(@RequestBody RegisterRequest request) {
        return "User registered";
    }

    @PostMapping("/login")
    public String login() {
        return jwtUtil.generateToken("test@mail.com", "USER", 1L);
    }
}
