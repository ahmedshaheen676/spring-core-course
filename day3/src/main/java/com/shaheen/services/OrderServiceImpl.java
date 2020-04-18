package com.day3.services;

import com.day3.repos.OrderRepo;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component(value = "orderService")
public class OrderServiceImpl implements OrderService {

    private OrderRepo orderRepo;

    public OrderServiceImpl() {
        System.out.println(" order Required");
        System.out.println(toString());
    }


    public OrderRepo getOrderRepo() {
        return orderRepo;
    }

    @Required
    public void setOrderRepo(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }
}
