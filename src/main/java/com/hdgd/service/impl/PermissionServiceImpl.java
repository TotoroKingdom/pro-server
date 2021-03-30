package com.hdgd.service.impl;

import com.hdgd.mapper.PermissionMapper;
import com.hdgd.pojo.Permission;
import com.hdgd.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public List<Permission> getPermissionByUserID(int userID){
        return permissionMapper.getPermissionByUserID(userID);
    }


    //查询具体某个接口的权限
    @Override
    public List<Permission> selectListByPath(String path) {
        return permissionMapper.selectListByPath(path);
    }

    @Override
    public List<Permission> selectAllPermission() {
        return permissionMapper.selectAllPermission();
    }
}
