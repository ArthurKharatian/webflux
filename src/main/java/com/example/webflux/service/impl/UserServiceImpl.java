package com.example.webflux.service.impl;

import com.example.webflux.db.User;
import com.example.webflux.dto.request.UserRequest;
import com.example.webflux.dto.response.UserResponse;
import com.example.webflux.repo.UserRepo;
import com.example.webflux.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;
    private final ObjectMapper mapper;

    @Override
    public Mono<UserResponse> create(UserRequest user) {
        return userRepo.save(mapper.convertValue(user, User.class))
                .map(u -> mapper.convertValue(u, UserResponse.class))
                .single();
    }

    @Override
    public Flux<UserResponse> findAll() {
        return userRepo.findAll()
                .map(u -> mapper.convertValue(u, UserResponse.class));
    }

}
