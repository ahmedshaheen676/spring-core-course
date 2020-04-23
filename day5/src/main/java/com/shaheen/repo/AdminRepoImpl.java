package com.shaheen.repo;

import com.shaheen.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class AdminRepoImpl implements UserRepo {
    @Override
    public User findByEmailAndPassword(String mail, String password) {
        return null;
    }
}
