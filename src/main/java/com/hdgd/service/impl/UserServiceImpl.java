package com.hdgd.service.impl;

import com.github.pagehelper.PageHelper;
import com.hdgd.mapper.UserMapper;
import com.hdgd.pojo.User;
import com.hdgd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void deleteUser(int userID){
        userMapper.deleteUser(userID);
    }

    @Override
    public User getUserByID(int userID){
        return userMapper.getUserByID(userID);
    }

    @Override
    public List<User> findAllUser(){
        return userMapper.findAllUser();
    }

    @Override
    public List<Map<String,Object>> queryPageUser(int pageNum,int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<Map<String ,Object>> maps = userMapper.queryPageUser();
        return maps;
    }

    @Override
    public void updateUser(User user){
        userMapper.updateUser(user);
    }

    @Override
    public void addUser(User user){
        userMapper.addUser(user);
    }

}
