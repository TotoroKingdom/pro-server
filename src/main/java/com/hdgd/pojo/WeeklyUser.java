package com.hdgd.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class WeeklyUser {

    private int weeklyID;
    private int userID;
    private String empName;
    private String weeklyContent;
    private Date startTime;
    private Date endTime;

}
