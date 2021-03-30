package com.hdgd.service.impl;


import com.hdgd.mapper.RoleMapper;
import com.hdgd.pojo.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl {

    @Autowired
    private RoleMapper roleMapper;


    public List<Role> getRoleByUserID(int userID){
        return roleMapper.getRoleByUserID(userID);
    }

}
