package com.sneakerhead.boot.controller;

import com.sneakerhead.boot.model.User;
import com.sneakerhead.boot.service.UserService;
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

    @RequestMapping(method = RequestMethod.GET)
    public User getUser(@RequestParam("id")Long id){
        return userService.getById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public String save(@RequestBody User user){
        return userService.save(user);
    }
}
