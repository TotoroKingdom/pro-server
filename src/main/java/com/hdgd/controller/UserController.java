package com.hdgd.controller;

import com.github.pagehelper.PageInfo;
import com.hdgd.common.entity.JsonResult;
import com.hdgd.common.utils.ResultTool;
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

    //添加
    @PostMapping("/addUser")
    public String addUser(@RequestBody User user){
        userService.addUser(user);
        return "";
    }

    //删除用户
    @PostMapping("/deleteUser")
    public JsonResult deleteUser(@RequestBody User user){
        User user1 = userService.deleteUser(user.getUserID());
        return ResultTool.success(user1);
    }
    //根据userID得到用户
    @PostMapping("/getUserByID")
    public User getUserByID(@RequestBody User user){
        User users = userService.getUserByID(user.getUserID());
        return users;
    }


    //分页查询用户
    @PostMapping("/getPageUser")
    public PageInfo<Map<String, Object>> queryPageUser(@RequestBody User user){
        int pageNum=user.getPageNum();
        int pageSize=user.getPageSize();
        List<Map<String, Object>> maps = userService.queryPageUser(pageNum,pageSize);
        PageInfo<Map<String, Object>> pageInfo = new PageInfo<Map<String, Object>>(maps);
        return pageInfo;
    }

    //修改
    @PostMapping("/updateUser")
    public String updateUser(@RequestBody User user){
        userService.updateUser(user);
        return "";
    }

    //测试
    @PostMapping("/getUser")
    public JsonResult getUser() {
        List<User> users = userService.queryAllByLimit(1, 100);
        return ResultTool.success(users);
    }

}
