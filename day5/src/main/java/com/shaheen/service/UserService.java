package com.shaheen.service;

import com.shaheen.model.User;

public interface UserService {
    User login(String mail, String password);
}
