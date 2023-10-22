package com.example.webflux.controllers;

import com.example.webflux.db.User;
import com.example.webflux.dto.request.UserRequest;
import com.example.webflux.dto.response.UserResponse;
import com.example.webflux.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public Flux<UserResponse> getAll () {
        return userService.findAll();
    }

    @PostMapping
    public Mono<UserResponse> create (@RequestBody UserRequest user) {
        return userService.create(user);
    }

}
