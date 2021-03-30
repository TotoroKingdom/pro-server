package com.hdgd.controller;

import com.hdgd.pojo.Permission;
import com.hdgd.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class PermissionController {

    @Autowired
    private PermissionService permissionService;

    //查询权限列表
    @PostMapping("/getPermissionList")
    public List<Permission> selectAllPermission(){
        return permissionService.selectAllPermission();
    }
}
