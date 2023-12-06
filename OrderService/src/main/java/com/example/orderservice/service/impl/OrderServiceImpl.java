/*******************************************************************************
 *   (C) Copyright . Corporation 2023 All Rights Reserved.
 * *****************************************************************************
 *    Author    : GosuZYH
 *    FileName  : UserServiceImpl
 *     Time     : 2023/12/6-14:54
 *******************************************************************************/
package com.example.orderservice.service.impl;

import com.example.orderservice.entities.Order;
import com.example.orderservice.mapper.OrderMapper;
import com.example.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public Order findById(Integer id) {
        return orderMapper.findById(id);
    }
}
