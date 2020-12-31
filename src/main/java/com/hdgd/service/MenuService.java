package com.hdgd.service;

import com.hdgd.pojo.Menu;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface MenuService {

    public Menu getMenuById(int id);


}
