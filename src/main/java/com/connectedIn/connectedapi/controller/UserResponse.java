package com.connectedIn.connectedapi.controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Builder
@Getter
@Setter
public class UserResponse {

    @JsonProperty("codigo")
    private Long id;

    @JsonProperty("cliente")
    private String name;

    private String lastName;
    private String email;
    private String username;
    private String password;
    private LocalDate born;
}
