package com.example.webflux.service;

import com.example.webflux.dto.request.UserRequest;
import com.example.webflux.dto.response.UserResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserService {

    Mono<UserResponse> create(UserRequest user);

    Flux<UserResponse> findAll();

}
