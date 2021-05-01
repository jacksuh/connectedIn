package com.connectedIn.connectedapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/")
    public void hello(){
        return "Hello World";
    }
}
