package com.example.hw_mockito.service.impl;

import com.example.hw_mockito.model.User;
import com.example.hw_mockito.service.UserDao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserDaoImpl implements UserDao {
    private List<User> userList;
    User user1 = new User("Den");
    User user2 = new User("John");
    User user3 = new User("Brad");

    public UserDaoImpl(List<User> userList) {
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        this.userList = userList;
    }

    @Override
    public List<User> getUserByName(String name) {
        if (name == null) {
            return null;
        } else {
            return userList.stream()
                    .filter(user -> user.getName().equals(name))
                    .toList();
        }
    }

    @Override
    public List<User> findAllUsers() {
        return userList;
    }
}
