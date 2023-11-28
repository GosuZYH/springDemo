/*******************************************************************************
 *   (C) Copyright . Corporation 2023 All Rights Reserved.
 * *****************************************************************************
 *    Author    : GosuZYH
 *    FileName  : UserController
 *     Time     : 2023/11/28-18:23
 *******************************************************************************/
package com.example.myspring.controller;

import com.example.myspring.entities.User;
import com.example.myspring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findByName")
    public User findByName(String name){
        return userService.findByName(name);
    }
}
