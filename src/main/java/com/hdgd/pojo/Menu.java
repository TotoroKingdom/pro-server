package com.hdgd.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Menu {
    private int id;
    private String parentId;
    private String menuName;
    private String url;
    private String icon;
    private String orderNum;
    private String open;
    private String disabled;
    private String perms;
    private String type;
    private List<Menu> children;
}
