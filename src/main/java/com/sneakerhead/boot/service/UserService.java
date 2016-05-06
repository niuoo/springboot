package com.sneakerhead.boot.service;

import com.sneakerhead.boot.model.User;

/**
 * Created by wanghuiwu on 2016/4/16.
 */
public interface UserService {
    User getById(Long id);
    String save(User user);
}
