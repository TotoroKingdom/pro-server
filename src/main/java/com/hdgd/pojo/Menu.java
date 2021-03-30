package com.hdgd.pojo;

import lombok.Data;

import java.util.List;


@Data
public class Menu {

    private int menuID;
    private String url;
    private String path;
    private String component;
    private String name;
    private String icon;
    private Boolean keepAlive;
    private Boolean requireAuth;
    private int parentID;
    private Boolean enabled;
    private List<Menu> children;



}
