package com.hdgd.controller;


import com.hdgd.pojo.Weekly;
import com.hdgd.pojo.WeeklyUser;
import com.hdgd.service.WeeklyService;
import com.hdgd.service.WeeklyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class WeeklyUserController {

    @Autowired
    private WeeklyUserService weeklyUserService;

    @GetMapping("/weeklyView")
    public List<WeeklyUser> weeklyView(){
        return weeklyUserService.weeklyView();
    }
}
