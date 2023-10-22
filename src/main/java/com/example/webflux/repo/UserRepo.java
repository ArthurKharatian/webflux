package com.example.webflux.repo;

import com.example.webflux.db.User;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface UserRepo extends ReactiveCrudRepository<User, Long> {
}
