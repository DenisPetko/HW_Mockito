package com.example.hw_mockito.service;

import com.example.hw_mockito.model.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {
    private final UserDao userDao;

    public UserDaoTest(UserDao userDao) {
        this.userDao = userDao;
    }
    private final String INCORRECT_NAME = "Ivan";


    @Test
    void getUserByName() {
        User correctUser = new User("Den");

        assertEquals(Optional.of(correctUser), userDao.getUserByName(correctUser.getName()));
        //или ?
        assertTrue(userDao.findAllUsers().contains(correctUser));

        assertNull(userDao.getUserByName(INCORRECT_NAME));
    }
}