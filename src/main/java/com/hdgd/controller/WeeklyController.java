package com.hdgd.controller;


import com.github.pagehelper.PageInfo;
import com.hdgd.common.entity.JsonResult;
import com.hdgd.common.utils.ResultTool;
import com.hdgd.pojo.User;
import com.hdgd.pojo.Weekly;
import com.hdgd.service.WeeklyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class WeeklyController {

    @Autowired
    private WeeklyService weeklyService;

    //添加周报
    @PostMapping("/addWeekly")
    public String addWeekly(@RequestBody Weekly weekly) {
        weeklyService.addWeekly(weekly);
        return "";
    }

    //删除周报
    @PostMapping("/deleteWeekly")
    public JsonResult deleteWeekly(@RequestBody Weekly weekly){
        Weekly weekly1 = weeklyService.deleteWeekly(weekly.getWeeklyID());
        return ResultTool.success(weekly1);
    }

    //修改周报
    @PostMapping("/updateWeekly")
    public String updateWeekly(@RequestBody Weekly weekly){
        weeklyService.updateWeekly(weekly);
        return "";
    }


    //分页查询周报
    @PostMapping("/getPageWeekly")
    public PageInfo<Map<String, Object>> queryPageWeekly(@RequestBody User user){
        int pageNum=user.getPageNum();
        int pageSize=user.getPageSize();
        List<Map<String, Object>> maps = weeklyService.queryPageWeekly(pageNum,pageSize);
        PageInfo<Map<String,Object>> pageInfo = new PageInfo<Map<String,Object>>(maps);
        return pageInfo;
    }

    //分页查询声学部周报
    @PostMapping("/getAcousticsWeekly")
    public PageInfo<Map<String, Object>> queryAcousticsWeekly(@RequestBody User user){
        int pageNum=user.getPageNum();
        int pageSize=user.getPageSize();
        List<Map<String, Object>> maps = weeklyService.queryAcousticsWeekly(pageNum,pageSize);
        PageInfo<Map<String, Object>> pageInfo = new PageInfo<>(maps);
        return pageInfo;
    }

    //分页查询显控部周报
    @PostMapping("/getDisplayControlWeekly")
    public PageInfo<Map<String, Object>> queryDisplayControlWeekly(@RequestBody User user){
        int pageNum=user.getPageNum();
        int pageSize=user.getPageSize();
        List<Map<String, Object>> maps = weeklyService.queryDisplayControlWeekly(pageNum,pageSize);
        PageInfo<Map<String, Object>> pageInfo = new PageInfo<>(maps);
        return pageInfo;
    }

    //分页查询图形图像周报
    @PostMapping("/getImageWeekly")
    public PageInfo<Map<String, Object>> queryImageWeekly(@RequestBody User user){
        int pageNum=user.getPageNum();
        int pageSize=user.getPageSize();
        List<Map<String, Object>> maps = weeklyService.queryImageWeekly(pageNum,pageSize);
        PageInfo<Map<String, Object>> pageInfo = new PageInfo<>(maps);
        return pageInfo;
    }


    //根据userID分页查询周报
    @GetMapping("/getWeeklyByUserID")
    public PageInfo<Map<String, Object>> getWeeklyByUserID(int userID,int pageNum, int pageSize){
        List<Map<String, Object>> maps = weeklyService.getPageWeeklyByUserID(userID,pageNum,pageSize);
        PageInfo<Map<String,Object>> pageInfo = new PageInfo<Map<String,Object>>(maps);
        return pageInfo;
    }

    //根据weeklyID查询周报
    @PostMapping("/getWeeklyByWeeklyID")
    public JsonResult getWeeklyByWeeklyID(@RequestBody Weekly weekly){
        Weekly weekly2 = weeklyService.getWeeklyByWeeklyID(weekly.getWeeklyID());
        return ResultTool.success(weekly2);
    }


}
