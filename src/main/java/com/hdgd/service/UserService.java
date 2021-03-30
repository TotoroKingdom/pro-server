package com.hdgd.service;

import com.hdgd.pojo.Menu;
import com.hdgd.pojo.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Transactional
public interface UserService {

    public void addUser(User user);

    public User deleteUser(int userID);

    public void updateUser(User user);

    //分页查询用户
    public List<Map<String,Object>> queryPageUser(int pageNum,int pageSize);

    public User getUserByID(Integer userID);

    //登录
    public User loginByUsername(String username);

    //权限测试
    List<User> queryAllByLimit(int offset,int limit);



}
