package com.hdgd.service.impl;

import com.hdgd.mapper.MenuMapper;
import com.hdgd.pojo.Menu;
import com.hdgd.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    MenuMapper menuMapper;

    @Override
    public Menu getMenuById(int id) {
        Menu menu = menuMapper.getMenuById(id);
        menu.setChildren(menuMapper.getMenuByParentId(id));
        return menu;
    }

}
