package com.creaturelove.serviceImpl;

import com.creaturelove.model.User;
import com.creaturelove.service.UserService;

public class UserServiceImpl implements UserService {
    public User getUser(User user){
        System.out.println("Username: " + user.getName() );
        return user;
    }
}
