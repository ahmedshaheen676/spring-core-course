package com.shaheen;

import com.shaheen.config.DevConfig;
import com.shaheen.config.ProductionConfig;
import com.shaheen.controller.UserController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles(args[0]);
        context.register(ProductionConfig.class, DevConfig.class);
        context.refresh();
        UserController userController = (UserController) context.getBean("userController");
        userController.login();
        userController.readEnviVars();

    }
}
