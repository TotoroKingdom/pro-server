package com.hdgd.pojo;

import lombok.Data;

import java.util.List;

@Data
public class User {

    private Integer userID;
    private String empName;
    private String username;
    private String password;
    private int departmentID;
    private String post;
    private List<Weekly> weeklies;

    private Integer pageNum;
    private Integer pageSize;

}
