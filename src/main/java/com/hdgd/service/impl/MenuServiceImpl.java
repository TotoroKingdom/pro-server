package com.hdgd.service.impl;

import com.hdgd.mapper.MenuMapper;
import com.hdgd.pojo.Menu;
import com.hdgd.pojo.User;
import com.hdgd.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuMapper menuMapper;

    //根据用户ID查询菜单列表
    @Override
    public List<Menu> getMenuByUserID(int userID){
        List<Menu> menus = menuMapper.getMenuByUserID(userID);
        return menus;
    }
}
