package com.example.webflux.dto.response;

import com.example.webflux.dto.request.UserRequest;
import com.example.webflux.enums.UserStatus;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserResponse extends UserRequest {
    UserStatus status;
}
