package com.hdgd.service.impl;

import com.hdgd.mapper.WeeklyMapper;
import com.hdgd.mapper.WeeklyUserMapper;
import com.hdgd.pojo.Weekly;
import com.hdgd.pojo.WeeklyUser;
import com.hdgd.service.WeeklyService;
import com.hdgd.service.WeeklyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeeklyUserServiceImpl implements WeeklyUserService {

    @Autowired
    private WeeklyUserMapper weeklyUserMapper;

    @Override
    public List<WeeklyUser> weeklyView(){
        return weeklyUserMapper.weeklyView();
    }

}
