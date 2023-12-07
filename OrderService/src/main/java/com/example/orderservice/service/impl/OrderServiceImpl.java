/*******************************************************************************
 *   (C) Copyright . Corporation 2023 All Rights Reserved.
 * *****************************************************************************
 *    Author    : GosuZYH
 *    FileName  : UserServiceImpl
 *     Time     : 2023/12/6-14:54
 *******************************************************************************/
package com.example.orderservice.service.impl;

import com.example.orderservice.entities.Order;
import com.example.orderservice.entities.User;
import com.example.orderservice.mapper.OrderMapper;
import com.example.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Order findById(Integer id) {
        // 查询订单.
        Order order = orderMapper.findById(id);
        // 利用RestTepmplate发送http请求来查询用户.
        String url = "http://localhost:8080/user/" + order.getUser_id();
        User user = restTemplate.getForObject(url, User.class);
        // 封装请求获取到的用户给订单order.
        order.setUser(user);
        return order;
    }
}
