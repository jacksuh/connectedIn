package com.connectedIn.connectedapi.controller;

import com.connectedIn.connectedapi.controller.request.UserRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping
    public String create(@RequestBody UserRequest userRequest){
        return "Hello World";
    }
}
