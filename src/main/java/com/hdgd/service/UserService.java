package com.hdgd.service;

import com.hdgd.pojo.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface UserService {

    public List<User> findAllUser();

}
