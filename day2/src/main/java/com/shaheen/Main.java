package com.shaheen;

import com.shaheen.entity.Child;
import com.shaheen.entity.Parent;
import com.shaheen.services.OrderService;
import com.shaheen.services.UserService;
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
        Parent parent = (Parent) applicationContext.getBean("parent");
        Child child = (Child) applicationContext.getBean("child");
        System.out.println(parent);
        System.out.println(child);

    }
}
