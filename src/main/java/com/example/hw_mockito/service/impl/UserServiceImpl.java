package com.example.hw_mockito.service.impl;

import com.example.hw_mockito.model.User;
import com.example.hw_mockito.service.UserDao;
import com.example.hw_mockito.service.UserService;

public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public boolean checkUserExist(User user) {
        for (User findUser : userDao.findAllUsers()) {
            if (findUser.equals(user)) {
                return true;
            }
        }
        return false;
    }

}
