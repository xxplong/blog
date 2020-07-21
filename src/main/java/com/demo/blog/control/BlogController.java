package com.demo.blog.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {
    @GetMapping
    public String hello()
    {
        return "hello world";
    }
}
