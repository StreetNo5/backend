package com.StreetNo5.StreetNo5.controller;


import com.StreetNo5.StreetNo5.domain.dtos.SignupForm;
import com.StreetNo5.StreetNo5.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class UserController {

    @Autowired
    private final UserService service;

    @PostMapping("/login")
    public ResponseEntity<String> loginSuccess(String nickname) {
        String token = service.login(nickname);
        return ResponseEntity.ok(token);
    }

    @PostMapping("/signup")
    public Long signup(SignupForm signupForm) {
        return service.signup(signupForm);
    }

    @GetMapping("/check/{nickname}")
    public ResponseEntity<Boolean> checkNickNameDuplicate(@PathVariable String nickname) {
        return ResponseEntity.ok(service.checkNickNameExists(nickname));
    }

}
