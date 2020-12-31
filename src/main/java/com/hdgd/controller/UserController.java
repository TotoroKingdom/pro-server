package com.hdgd.controller;

import com.github.pagehelper.PageInfo;
import com.hdgd.pojo.User;
import com.hdgd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/deleteUser")
    public String deleteUser(int userID){
        userService.deleteUser(userID);
        return "";
    }

    @GetMapping("/getUserByID")
    public User getUserByID(int userID){
        return userService.getUserByID(userID);
    }

    @GetMapping("/findAllUser")
    public List<User> findAllUser(){
        return userService.findAllUser();
    }

    @GetMapping("/getPageUser")
    public PageInfo<Map<String, Object>> queryPageUser(int pageNum, int pageSize){
        List<Map<String, Object>> maps = userService.queryPageUser(pageNum,pageSize);
        PageInfo<Map<String, Object>> pageInfo = new PageInfo<Map<String, Object>>(maps);
        return pageInfo;
    }

    @PostMapping("/updateUser")
    public String updateUser(@RequestBody User user){
        userService.updateUser(user);
        return "";
    }

    @PostMapping("/addUser")
    public String addUser(@RequestBody User user){
        userService.addUser(user);
        return "";
    }

}
