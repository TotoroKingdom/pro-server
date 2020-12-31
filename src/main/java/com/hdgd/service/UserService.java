package com.hdgd.service;

import com.hdgd.pojo.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Transactional
public interface UserService {

    public List<User> findAllUser();

    public List<Map<String,Object>> queryPageUser(int pageNum,int pageSize);

    public User getUserByID(int userID);

    public void updateUser(User user);

    public void addUser(User user);

    public void deleteUser(int userID);

}
