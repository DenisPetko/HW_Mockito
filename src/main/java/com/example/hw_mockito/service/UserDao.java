package com.example.hw_mockito.service;

import com.example.hw_mockito.model.User;

import java.util.List;

public interface UserDao {
    User getUserByName(String name);

    List<User> findAllUsers();
}
