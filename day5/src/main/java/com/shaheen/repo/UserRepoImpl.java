package com.shaheen.repo;

import com.shaheen.config.DataSource;
import com.shaheen.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class UserRepoImpl implements UserRepo {

    private Connection connection = null;
    private final String findByEmailAndPassword = "SELECT * FROM USERS WHERE EMAIL =?" +
            " AND PASSWORD =?";

    @Autowired
    public UserRepoImpl(DataSource dataSource) {
        connection = dataSource.getConnection();
    }

    @Override
    public User findByEmailAndPassword(String mail, String password) {
        User user = new User();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(findByEmailAndPassword);
            preparedStatement.setString(1, mail);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println(resultSet);
            while (resultSet.next()) {
                user.setId((int) resultSet.getLong("USER_ID"));
                user.setName(resultSet.getString("FIRST_NAME"));
                user.setEmail(resultSet.getString("EMAIL"));
                user.setPassword(resultSet.getString("PASSWORD"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
}
