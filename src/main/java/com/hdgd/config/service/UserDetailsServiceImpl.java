package com.hdgd.config.service;

import com.hdgd.pojo.Menu;
import com.hdgd.pojo.User;
import com.hdgd.service.MenuService;
import com.hdgd.service.PermissionService;
import com.hdgd.service.UserService;
import com.hdgd.pojo.Permission;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Autowired
    private PermissionService permissionService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        if(username==null || "".equals(username)){
            throw new RuntimeException("用户名不能为空。");
        }

        //根据用户名查询用户
        User user = userService.loginByUsername(username);

        if(user == null){
            throw new RuntimeException("用户不存在");
        }

        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();

        if(user != null){
            //获取该用户的的权限
            List<Permission> permissions = permissionService.getPermissionByUserID(user.getUserID());
            //声明用户权限
            permissions.forEach(permission -> {
                GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(permission.getPermissionCode());
                grantedAuthorities.add(grantedAuthority);
            });

        }

        return new org.springframework.security.core.userdetails.User(user.getUsername(),user.getPassword(),grantedAuthorities);
    }
}
