package com.shaheen;

public class UserFactory {
    private User createUser(String firstName, String lastName, Double salary, Address address) {
        return new User(firstName, lastName, salary, address);
    }

    private static User getUser(String firstName, String lastName, Double salary, Address address) {
        return new User(firstName, lastName, salary, address);
    }
}
