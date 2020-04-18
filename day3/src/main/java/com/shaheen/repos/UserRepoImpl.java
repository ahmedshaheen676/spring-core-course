package com.day3.repos;

import org.springframework.stereotype.Component;

@Component(value = "userRepo")
public class UserRepoImpl implements UserRepo {
    public UserRepoImpl() {
        System.out.println(toString());
    }
}
