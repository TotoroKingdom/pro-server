package com.hdgd.service.impl;

import com.github.pagehelper.PageHelper;
import com.hdgd.mapper.UserMapper;
import com.hdgd.mapper.WeeklyMapper;
import com.hdgd.pojo.Menu;
import com.hdgd.pojo.User;
import com.hdgd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private WeeklyMapper weeklyMapper;

    //添加
    @Override
    public void addUser(User user){
        userMapper.addUser(user);
    }

    //删除用户
    @Override
    public User deleteUser(int userID){
        userMapper.deleteUser(userID);
        return null;
    }

    //依据用户ID查询用户信息以及其周报
    @Override
    public User getUserByID(Integer userID){
        User user = userMapper.getUserByID(userID);
        user.setWeeklies(weeklyMapper.getWeeklyByUserID(userID));
        return user;
    }


    //分页查询用户
    @Override
    public List<Map<String,Object>> queryPageUser(int pageNum,int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<Map<String ,Object>> maps = userMapper.queryPageUser();
        return maps;
    }

    //更新
    @Override
    public void updateUser(User user){
        userMapper.updateUser(user);
    }

    //登录信息
    @Override
    public User loginByUsername(String username){
        User user = userMapper.loginByUsername(username);
        user.setWeeklies(weeklyMapper.getWeeklyByUserID(user.getUserID()));
        return user;
    }

    //权限测试
    @Override
    public List<User> queryAllByLimit(int offset,int limit){
        return this.userMapper.queryAllByLimit(offset,limit);
    }



}
