package com.hdgd.service;

import com.hdgd.pojo.Weekly;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Transactional
public interface WeeklyService {

    //添加周报
    public void addWeekly(Weekly weekly);

    //删除周报
    public Weekly deleteWeekly(int weeklyID);

    //修改周报
    public void updateWeekly(Weekly weekly);

    //分页查询所有周报
    public List<Map<String,Object>> queryPageWeekly(int pageNum,int pageSize);

    //分页查询声学部周报
    public List<Map<String,Object>> queryAcousticsWeekly(int pageNum,int pageSize);

    //分页查询显控部周报
    public List<Map<String,Object>> queryDisplayControlWeekly(int pageNum,int pageSize);

    //分页查询图像部周报
    public List<Map<String,Object>> queryImageWeekly(int pageNum,int pageSize);

    //根据用户ID分页查询周报
    public List<Map<String,Object>> getPageWeeklyByUserID(int userID,int pageNum,int pageSize);

    //根据周报ID查周报
    public Weekly getWeeklyByWeeklyID(int weeklyID);


}
