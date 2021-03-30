package com.hdgd.service;

import com.hdgd.pojo.Permission;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface PermissionService {

    List<Permission> getPermissionByUserID(int userID);

    //查询具体某个接口的权限
    List<Permission> selectListByPath(String path);

    List<Permission> selectAllPermission();
}
