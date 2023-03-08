package com.example.hw_mockito.service.impl;

import com.example.hw_mockito.model.User;
import com.example.hw_mockito.service.UserDao;

import java.util.List;

public class UserDaoImpl implements UserDao {
    private final List<User> userList;

    public UserDaoImpl(List<User> userList) {
        this.userList = List.of(new User("Den"), new User("John"), new User("Brad"));
    }

    @Override
    public User getUserByName(String name) {
        return userList.stream()
                .filter(user -> user.getName().equals(name))
                .findAny();  //тут пробовал вернуть Optional<User>, но тогда в тесте
//        assertEquals(correctUser, userDao.getUserByName(correctUser.getName())) ругается на разные типы
    }

    @Override
    public List<User> findAllUsers() {
        return userList;
    }
}
