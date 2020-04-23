package com.shaheen.repos;

import org.springframework.stereotype.Component;

@Component(value = "userRepo")
public class UserRepoImpl implements UserRepo {
    public UserRepoImpl() {
        System.out.println(toString());
    }
}
