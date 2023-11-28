package com.example.myspring.service;

import com.example.myspring.entities.User;

public interface UserService {
    public User findByName(String name);
}
