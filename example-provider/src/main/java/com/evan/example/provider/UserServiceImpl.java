package com.evan.example.provider;


import com.evan.example.commom.model.User;
import com.evan.example.commom.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User getUser(User user) {
        System.out.println("用户名:" + user.getName());
        return user;
    }
}
