package com.shaheen;

import com.shaheen.services.OrderService;
import com.shaheen.services.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService1 = (UserService) applicationContext.getBean("userService");
        UserService userService2 = (UserService) applicationContext.getBean("userService");
        OrderService orderService1 = (OrderService) applicationContext.getBean("orderService");
        OrderService orderService2 = (OrderService) applicationContext.getBean("orderService");
//        orderService1.printOrder(1);
    }
}
