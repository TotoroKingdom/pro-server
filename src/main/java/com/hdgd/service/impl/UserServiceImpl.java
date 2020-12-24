package com.hdgd.service.impl;

import com.hdgd.mapper.UserMapper;
import com.hdgd.pojo.User;
import com.hdgd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAllUser(){
        return userMapper.findAllUser();
    }

}
