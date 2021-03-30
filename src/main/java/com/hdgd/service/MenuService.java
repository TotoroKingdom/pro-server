package com.hdgd.service;

import com.hdgd.pojo.Menu;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface MenuService {

    //根据用户id查询菜单
    List<Menu> getMenuByUserID(int userID);


}
