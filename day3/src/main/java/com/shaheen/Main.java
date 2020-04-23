package com.shaheen;

import com.shaheen.services.OrderService;
import com.shaheen.services.UserService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        applicationContext.registerShutdownHook();
        UserService userService = (UserService) applicationContext.getBean("userService");
        OrderService orderService = (OrderService) applicationContext.getBean("orderService");

    }
}
