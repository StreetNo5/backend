package com.StreetNo5.StreetNo5.controller;

import com.StreetNo5.StreetNo5.domain.UserPost;
import com.StreetNo5.StreetNo5.domain.Users;
import com.StreetNo5.StreetNo5.service.UserPostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BoardController {

    private final UserPostService userPostService;
    @GetMapping("/board")
    public List<UserPost> getBoardList() {
        List<UserPost> userPosts = userPostService.getUserPosts();
        return userPosts;
    }

}
