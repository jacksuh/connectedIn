package com.connectedIn.connectedapi.service;

import com.connectedIn.connectedapi.entity.UserEntity;
import com.connectedIn.connectedapi.model.User;
import com.connectedIn.connectedapi.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

    public User create(User user){
        UserEntity userEntity = repository.save(UserEntity.builder()
                .username(user.getUsername())
                .email(user.getEmail())
                .lastName(user.getLastName())
                .name(user.getName())
                .password(user.getPassword())
                .born(user.getBorn())
                .build());

        User userSaved = User.builder()
                .username(userEntity.getUsername())
                .name(userEntity.getName())
                .born(userEntity.getBorn())
                .email(userEntity.getEmail())
                .password(userEntity.getPassword())
                .lastName(userEntity.getLastName())
                .id(userEntity.getId())
                .build();
        return userSaved;
    }
}
