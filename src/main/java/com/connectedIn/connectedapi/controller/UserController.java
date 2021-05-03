package com.connectedIn.connectedapi.controller;

import com.connectedIn.connectedapi.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public String create(@RequestBody UserRequest userRequest){
        System.out.println("User: " + userRequest);
        return "Hello World";
    }
}
