package com.shaheen.service;

import com.shaheen.model.User;
import com.shaheen.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    @Qualifier("userRepoImpl")
    private UserRepo userRepo;

    public UserServiceImpl() {
        System.out.println(toString());
    }

    @Override
    public User login(String mail, String password) {
        return userRepo.findByEmailAndPassword(mail, password);

    }
}
