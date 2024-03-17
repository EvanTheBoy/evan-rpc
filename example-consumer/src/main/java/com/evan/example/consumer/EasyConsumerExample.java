package com.evan.example.consumer;

import com.evan.example.commom.model.User;
import com.evan.example.commom.service.UserService;

public class EasyConsumerExample {
    public static void main(String[] args) {
        // 实现代理对象类
        UserService userService = new UserServiceProxy();
        User user = new User();
        user.setName("evan");
        User newUser = userService.getUser(user);
        if (newUser != null) {
            System.out.println(newUser.getName());
        } else {
            System.out.println("user == null");
        }
    }
}
