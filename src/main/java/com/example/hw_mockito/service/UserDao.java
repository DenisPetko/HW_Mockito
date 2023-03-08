package com.example.hw_mockito.service;

import com.example.hw_mockito.model.User;

import java.util.List;
import java.util.Optional;

public interface UserDao {
    Optional<User> getUserByName(String name);

    List<User> findAllUsers();
}
