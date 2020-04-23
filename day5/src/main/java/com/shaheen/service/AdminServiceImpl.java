package com.shaheen.service;

import com.shaheen.model.User;
import org.springframework.stereotype.Service;

@Service("adminService")
public class AdminServiceImpl implements UserService {
    public AdminServiceImpl() {
        System.out.println(toString());
    }

    @Override
    public User login(String mail, String password) {
        return null;
    }
}
