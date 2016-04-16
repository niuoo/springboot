package com.sneakerhead.boot.controller;

import com.alibaba.fastjson.JSON;
import com.sneakerhead.boot.module.User;
import com.sneakerhead.boot.service.UserService;
import com.sneakerhead.boot.util.redis.ByteJedisCluster;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by wanghuiwu on 2016/3/29.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    private final static Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/{id}")
    public User getUser(@PathVariable("id")Long id){
        return userService.getById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public String save(@RequestBody User user){
        return userService.save(user);
    }
}
