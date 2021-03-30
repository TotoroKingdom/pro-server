package com.hdgd.service.impl;

import com.github.pagehelper.PageHelper;
import com.hdgd.mapper.WeeklyMapper;
import com.hdgd.pojo.Weekly;
import com.hdgd.service.WeeklyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class WeeklyServiceImpl implements WeeklyService {

    @Autowired
    private WeeklyMapper weeklyMapper;

    //添加周报
    @Override
    public void addWeekly(Weekly weekly){
        weeklyMapper.addWeekly(weekly);
    }

    //删除周报
    @Override
    public Weekly deleteWeekly(int weeklyID){
        weeklyMapper.deleteWeekly(weeklyID);
        return null;
    }

    //修改周报
    @Override
    public void updateWeekly(Weekly weekly){
        weeklyMapper.updateWeekly(weekly);
    }

    //分页查询周报
    @Override
    public List<Map<String,Object>> queryPageWeekly(int pageNum,int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<Map<String, Object>> maps = weeklyMapper.queryPageWeekly();
        return maps;
    }

    //分页查询声学部周报
    @Override
    public List<Map<String,Object>> queryAcousticsWeekly(int pageNum,int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<Map<String, Object>> maps = weeklyMapper.queryAcousticsWeekly();
        return maps;
    }

    //分页查询显控部周报
    @Override
    public List<Map<String,Object>> queryDisplayControlWeekly(int pageNum,int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<Map<String, Object>> maps = weeklyMapper.queryDisplayControlWeekly();
        return maps;
    }

    //分页查询图形图像部周报
    @Override
    public List<Map<String,Object>> queryImageWeekly(int pageNum,int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<Map<String, Object>> maps = weeklyMapper.queryImageWeekly();
        return maps;
    }

    //根据userID分页查询周报
    @Override
    public List<Map<String,Object>> getPageWeeklyByUserID(int userID,int pageNum,int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<Map<String, Object>> maps = weeklyMapper.getPageWeeklyByUserID(userID);
        return maps;
    }

    //根据周报ID查周报
    @Override
    public Weekly getWeeklyByWeeklyID(int weeklyID){
        return weeklyMapper.getWeeklyByWeeklyID(weeklyID);
    }





}
