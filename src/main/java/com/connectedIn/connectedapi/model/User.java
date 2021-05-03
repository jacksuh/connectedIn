package com.connectedIn.connectedapi.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Builder
public class User {

    private Long id;
    private String name;
    private String lastName;
    private String email;
    private String username;
    private String password;
    private LocalDate born;
}
