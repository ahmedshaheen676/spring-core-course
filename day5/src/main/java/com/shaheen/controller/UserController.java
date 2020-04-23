package com.shaheen.controller;

import com.shaheen.model.User;
import com.shaheen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;

import java.util.Arrays;
import java.util.Properties;

@Controller
public class UserController {
    @Autowired
    @Qualifier("userService")
    UserService userService;

    @Autowired
    Environment environment;

    public UserController() {

    }

    public void login() {
        User user = userService.login("ahmedshaheen676@yahoo.com", "ahm741741");
        System.out.println(user);
    }

    public void readEnviVars() {
        Arrays.stream(environment.getActiveProfiles()).forEach(System.out::println);
        Properties properties = System.getProperties();
        properties.forEach((k, v) -> {
            System.out.println(k + "=" + environment.getProperty((String) k));
        });

    }
}
