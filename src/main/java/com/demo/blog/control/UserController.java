package com.demo.blog.control;

import com.demo.blog.entity.User;
import com.demo.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/find/{id}")
    public User find(@PathVariable("id") int id) {
        return userService.find(id);
    }

    @PostMapping("/addUser")
    //入参加@RequestBody则只能用于接受Content-Type类型为application/json格式
    //不加则是Content-Type类型为application/x-www-form-urlencoded的form表单编码格式
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @PutMapping("/updateUser")
    public void updateUser(@RequestBody User user) {
        userService.updateUser(user);
    }

    @DeleteMapping("/deleteUser/{id}")
    //入参是占位符，则加@PathVariable，以url地址作为请求
    //入参不用占位符，加或者不加@RequestParam都是作为请求体的数据
    public void deleteUser(@PathVariable("id") int id) {
        userService.deleteUser(id);
    }
}