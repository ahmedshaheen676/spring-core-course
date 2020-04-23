package com.shaheen.repo;

import com.shaheen.model.User;

public interface UserRepo {
    User findByEmailAndPassword(String mail, String password);
}
