package com.example.hw_mockito.service.impl;

import com.example.hw_mockito.model.User;
import com.example.hw_mockito.service.UserDao;
import com.example.hw_mockito.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    @Override
    public boolean checkUserExist(User user) {
        List<User> listUser = userDao.findAllUsers();
        for (User findUser : listUser) {
            if (findUser.equals(user)) {
                return true;
            }
        }
        return false;
    }


}
