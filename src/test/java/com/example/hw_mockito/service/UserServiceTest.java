package com.example.hw_mockito.service;

import com.example.hw_mockito.model.User;
import com.example.hw_mockito.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.util.Assert;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    private final String CORRECT_NAME = "Den";
    private final String INCORRECT_NAME = "Tod";

    @Mock
    private UserDao userDao;
    @InjectMocks
    private UserServiceImpl userService;

    @Test
    void checkUserExistTrue() {
        User user = new User("Den");
        List<User> userList = List.of(new User("Den"), new User("John"), new User("Brad"));
        Mockito.when(userDao.findAllUsers()).thenReturn(userList);
        assertTrue(userService.checkUserExist(user));
    }

    @Test
    void checkUserExistFalse() {
        User user = new User(INCORRECT_NAME);
        List<User> userListIncorrect = List.of(new User("Den"), new User("John"), new User("Brad"));
        Mockito.when(userDao.findAllUsers()).thenReturn(userListIncorrect);
        assertFalse(userService.checkUserExist(user));
    }
}