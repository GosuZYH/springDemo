/*******************************************************************************
 *   (C) Copyright . Corporation 2023 All Rights Reserved.
 * *****************************************************************************
 *    Author    : GosuZYH
 *    FileName  : UserServiceImpl
 *     Time     : 2023/11/28-16:48
 *******************************************************************************/
package com.example.myspring.service.impl;

import com.example.myspring.entities.User;
import com.example.myspring.mapper.UserMapper;
import com.example.myspring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }

}
