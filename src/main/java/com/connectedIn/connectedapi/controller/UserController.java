package com.connectedIn.connectedapi.controller;

import com.connectedIn.connectedapi.model.User;
import com.connectedIn.connectedapi.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public User create(@RequestBody UserRequest userRequest){
        User user = userService.create(User.builder()
                .name(userRequest.getName())
                .username(userRequest.getUsername())
                .lastName(userRequest.getLastName())
                .email(userRequest.getEmail())
                .password(userRequest.getPassword())
                .born(userRequest.getBorn())
                .build());
        return user;
    }
}
