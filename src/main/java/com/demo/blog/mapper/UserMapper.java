package com.demo.blog.mapper;

import com.demo.blog.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper//指定这是一个操作数据库的mapper
public interface UserMapper {
    List<User> findAll();

    User find(int id);

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(int id);
}
