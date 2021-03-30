package com.hdgd.controller;

import com.hdgd.pojo.Role;
import com.hdgd.service.impl.RoleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class RoleControlelr {

    @Autowired
    private RoleServiceImpl roleService;

    @GetMapping("getRoleByUserID")
    public List<Role> getRoleByUserID(int userID) {
        return roleService.getRoleByUserID(userID);
    }

}
