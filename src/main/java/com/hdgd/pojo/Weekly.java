package com.hdgd.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Data
public class Weekly {

    private int weeklyID;
    private int userID;
    private String weeklyContent;
    private Date startTime;
    private Date endTime;

    private User user;



}
