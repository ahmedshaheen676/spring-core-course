package com.day3;

import com.day3.services.OrderService;
import com.day3.services.UserService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        applicationContext.registerShutdownHook();
        UserService userService1 = (UserService) applicationContext.getBean("userService");
        UserService userService2 = (UserService) applicationContext.getBean("userService");
        OrderService orderService1 = (OrderService) applicationContext.getBean("orderService");
        OrderService orderService2 = (OrderService) applicationContext.getBean("orderService");

    }
}
