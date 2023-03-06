package com.example.hw_mockito.service;

import com.example.hw_mockito.model.User;

import java.util.List;

public interface UserDao {
    List<User>  getUserByName(String name);

    List<User> findAllUsers();
}
