package com.hdgd.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Project {

    private int projectID;
    private String projectName;
    private String projectDescription;
    private String projectManager;
    private String projectDepartment;
    private String Phase;
    private Date startTime;
    private Date endTime;

}
