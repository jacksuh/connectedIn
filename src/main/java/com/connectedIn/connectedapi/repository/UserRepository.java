package com.connectedIn.connectedapi.repository;

import com.connectedIn.connectedapi.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
}
