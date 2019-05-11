package com.example.demo.controller;

import com.example.demo.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @creatdate 2019-05-11 14:03
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/getUser")
    public User getUer(){
        return new User("qqqq","11对方的1111",12,"",new Date());
    }
}
