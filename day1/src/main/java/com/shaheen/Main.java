package com.shaheen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Address address = (Address) applicationContext.getBean("address");
        User userByAddress = (User) applicationContext.getBean("userByAddress");
        User userByIndex = (User) applicationContext.getBean("userByIndex");
        User createUser = (User) applicationContext.getBean("createUser");
        User getUser = (User) applicationContext.getBean("getUser");
        User userUsingPNameSpace = (User) applicationContext.getBean("userUsingPNameSpace");
//        User userByMissDataType = (User) applicationContext.getBean("userByMissDataType");
        User userByVaildDataType = (User) applicationContext.getBean("userByVaildDataType");
        List<User> friends = ((User) applicationContext.getBean("userHasFriends")).getFriends();
        System.out.println(address);
        System.out.println(userByAddress);
        System.out.println(userByIndex);
//        System.out.println(userByMissDataType);
        System.out.println(userByVaildDataType);
        System.out.println(createUser);
        System.out.println(getUser);

        friends.forEach(System.out::println);

    }
}
