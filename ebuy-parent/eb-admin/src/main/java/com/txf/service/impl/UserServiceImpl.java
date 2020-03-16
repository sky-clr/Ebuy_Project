package com.txf.service.impl;

import com.txf.mapper.UserMapper;
import com.txf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean login(String userName, String userPwd) {
        return userMapper.login(userName, userPwd) >= 1;
    }
}
