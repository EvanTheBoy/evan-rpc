package com.evan.example.consumer;

import com.evan.example.commom.model.User;
import com.evan.example.commom.service.UserService;

public class UserServiceProxy implements UserService {

    @Override
    public User getUser(User user) {
        // 指定序列化器

    }
}
