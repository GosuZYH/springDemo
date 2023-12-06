package com.example.orderservice.service;

import com.example.orderservice.entities.Order;

public interface OrderService {
    public Order findById(Integer id);

}
