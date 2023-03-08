package com.example.hw_mockito.service;

import com.example.hw_mockito.model.User;
import com.example.hw_mockito.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    private final String CORRECT_NAME = "Den";
    private final String INCORRECT_NAME = "Tod";

    @Mock
    private UserDao userDao;
    @InjectMocks
    private UserServiceImpl userService;

    @Test
    void checkUserExist() {
        User user = new User(CORRECT_NAME);
        User user1 = new User(INCORRECT_NAME);
//        UserServiceTest, в котором нам необходимо протестировать метод checkUserExist из класса UserService
//        Протестировать его нужно дважды: На возврат true и false при передачи ему разных значений
//        Значения устанавливаем с помощью функционала Mockito. То есть наша задача "замокать" обращение класса
//        UserService к классу UserDaoImpl.
        Mockito.when(userDao.getUserByName(user.getName())).then(true); ??
        Mockito.when(userDao.getUserByName(user1.getName())).then(false); ??
    }
}