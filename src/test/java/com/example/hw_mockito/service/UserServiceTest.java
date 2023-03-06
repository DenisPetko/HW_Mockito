package com.example.hw_mockito.service;

import com.example.hw_mockito.model.User;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    private final String CORRECT_NAME = "Den";
    private final String INCORRECT_NAME = "Tod";

    @Mock
    private UserDao userDao;
    private UserService userService;

    //    В конструкторе класса UserServiceTest используйте метод MockitoAnnotations.initMocks(this);
    public UserServiceTest(){
        MockitoAnnotations.initMocks(this); ??
    }

    @Test
    void checkUserExist() {
        User user = new User(CORRECT_NAME);
        User user1 = new User(INCORRECT_NAME);

        Mockito.when(userService.checkUserExist(user)).then(true); ??
        Mockito.when(userService.checkUserExist(user1)).then(false); ??
    }
}