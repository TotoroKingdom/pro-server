package com.hdgd.controller;


import com.hdgd.pojo.Weekly;
import com.hdgd.service.WeeklyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

@RestController
@CrossOrigin
public class WeeklyController {

    @Autowired
    private WeeklyService weeklyService;

    @PostMapping("/addWeekly")
    public String addWeekly(@RequestBody Weekly weekly) {
        weeklyService.addWeekly(weekly);
        return "";
    }

    @GetMapping("/findAllWeekly")
    public List<Weekly> findAllWeekly() {
        return weeklyService.findAllWeekly();
    }

}
