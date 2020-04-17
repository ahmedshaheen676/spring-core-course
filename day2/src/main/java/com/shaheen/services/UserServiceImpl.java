package com.shaheen.services;

import com.shaheen.repos.UserRepo;

public class UserServiceImpl implements UserService {
    UserRepo userRepo;

    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
        System.out.println("constructor autowired");
        System.out.println(toString());
    }
}
