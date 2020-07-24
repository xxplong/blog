package com.demo.blog.service;

import com.demo.blog.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User find(int id);

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(int id);
}
