package com.hdgd.controller;

import com.hdgd.pojo.Menu;
import com.hdgd.service.MenuService;
import com.hdgd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class MenuController {

    @Autowired
    private MenuService menuService;

    //根据用户ID查询菜单
    @GetMapping("/menu")
    public List<Menu> getMenuByUserID(int userID){
        return menuService.getMenuByUserID(userID);
    }


}
