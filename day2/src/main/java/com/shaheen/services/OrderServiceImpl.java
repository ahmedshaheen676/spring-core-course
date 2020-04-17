package com.shaheen.services;

import com.shaheen.repos.OrderRepo;

public class OrderServiceImpl implements OrderService {
    OrderRepo orderRepo;

    public OrderServiceImpl() {
        System.out.println("by name autowired");
        System.out.println(toString());
    }

    public OrderRepo getOrderRepo() {
        return orderRepo;
    }

    public void setOrderRepo(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }
}
