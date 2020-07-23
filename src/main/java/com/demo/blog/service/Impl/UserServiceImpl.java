package com.demo.blog.service.Impl;

import com.demo.blog.entity.User;
import com.demo.blog.mapper.UserMapper;
import com.demo.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public User find(int id) {
        return userMapper.find(id);
    }

    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }
}
