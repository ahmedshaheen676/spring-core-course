package com.shaheen.repos;

import org.springframework.stereotype.Component;

@Component(value = "orderRepo")
public class OrderRepoImpl implements OrderRepo {
    public OrderRepoImpl() {
        System.out.println(toString());
    }
}
