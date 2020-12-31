package com.hdgd.service.impl;

import com.hdgd.mapper.WeeklyMapper;
import com.hdgd.pojo.Weekly;
import com.hdgd.service.WeeklyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeeklyServiceImpl implements WeeklyService {

    @Autowired
    private WeeklyMapper weeklyMapper;

    @Override
    public List<Weekly> findAllWeekly(){
        return weeklyMapper.findAllWeekly();
    }

    @Override
    public void addWeekly(Weekly weekly){
        weeklyMapper.addWeekly(weekly);
    }

}
