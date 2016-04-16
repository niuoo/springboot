package com.sneakerhead.boot.controller;

import com.sneakerhead.boot.module.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wanghuiwu on 2016/3/29.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/{id}")
    public User getUser(@PathVariable("id")String phone){
        User user = new User();
        user.setName("balebalebale");
        user.setPhone(phone);
//        System.exit(0);
        return user;
    }

}
