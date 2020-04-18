package com.day3.services;

import com.day3.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;

    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
        System.out.println("constructor autowired");
        System.out.println(toString());
    }
}
