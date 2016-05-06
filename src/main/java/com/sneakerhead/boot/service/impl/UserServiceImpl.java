package com.sneakerhead.boot.service.impl;

import com.alibaba.fastjson.JSON;
import com.sneakerhead.boot.model.User;
import com.sneakerhead.boot.service.UserService;
import com.sneakerhead.boot.util.redis.ByteJedisCluster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wanghuiwu on 2016/4/16.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private ByteJedisCluster redisstore;

    private final static String rediskey = "user-";

    @Override
    public User getById(Long id) {
        if (redisstore.exists(rediskey + id)){
            return JSON.parseObject(redisstore.get(rediskey + id), User.class);
        }
        return new User(1l,"defaultName","defaultPhone");
    }

    @Override
    public String save(User user) {
        return redisstore.set(rediskey+user.getId(),JSON.toJSONString(user));
    }
}
