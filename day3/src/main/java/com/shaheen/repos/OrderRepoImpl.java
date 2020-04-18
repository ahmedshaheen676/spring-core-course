package com.day3.repos;

import org.springframework.stereotype.Component;

@Component(value = "orderRepo")
public class OrderRepoImpl implements OrderRepo {
    public OrderRepoImpl() {
        System.out.println(toString());
    }
}
