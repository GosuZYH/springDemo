/*******************************************************************************
 *   (C) Copyright . Corporation 2023 All Rights Reserved.
 * *****************************************************************************
 *    Author    : GosuZYH
 *    FileName  : OrderController
 *     Time     : 2023/12/6-14:58
 *******************************************************************************/
package com.example.orderservice.controller;

import com.example.orderservice.entities.Order;
import com.example.orderservice.service.impl.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderServiceImpl orderService;

    @GetMapping()
    public String testName() {
        return "Test name success!";
    }

    @GetMapping("/{id}")
    public Order findById(@PathVariable Integer id) {
        return orderService.findById(id);
    }
}
