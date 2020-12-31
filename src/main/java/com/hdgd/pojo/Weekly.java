package com.hdgd.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class Weekly {

    private int weeklyID;
    private int userID;
    private String weeklyContent;
    private LocalDate startTime;
    private LocalDate endTime;

}
