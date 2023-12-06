/*******************************************************************************
 *   (C) Copyright . Corporation 2023 All Rights Reserved.
 * *****************************************************************************
 *    Author    : GosuZYH
 *    FileName  : UserController
 *     Time     : 2023/11/28-18:23
 *******************************************************************************/
package com.example.myspring.controller;

import com.example.myspring.entities.User;
import com.example.myspring.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping()
    public String testName() {
        return "Test name success!";
    }

    @GetMapping("/{name}")
    public User findByName(@PathVariable String name) {
        return userService.findByName(name);
    }


}
