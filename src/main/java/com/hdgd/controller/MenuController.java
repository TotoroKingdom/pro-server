package com.hdgd.controller;

import com.hdgd.pojo.Menu;
import com.hdgd.service.MenuService;
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

    @GetMapping("/getMenu")
    public Menu getMenuById(int id){
        return menuService.getMenuById(id);
    }

}
