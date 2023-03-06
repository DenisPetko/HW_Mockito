package com.example.hw_mockito.service;

import com.example.hw_mockito.model.User;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {
    private UserDao userDao;

    private final String CORRECT_NAME = "Den";
    private final String INCORRECT_NAME = "Tod";

    @Test
    void getUserByName() {
        List<User> allUsers = userDao.findAllUsers();
        User correctUser = new User(CORRECT_NAME);
        User incorrectUser = new User(INCORRECT_NAME);
//        assertTrue(allUsers.contains(correctUser));
        assertEquals(CORRECT_NAME, correctUser.getName());
// Вторым тестовым методом будет обратная проверка на то, что метод вернет null,
// если мы зададим пользователя с именем, не существующем в списке.
        assertNull(userDao.getUserByName(CORRECT_NAME)); //
    }
}